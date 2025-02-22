/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.impl;

import static org.jooq.impl.DSL.inline;
import static org.jooq.impl.DSL.pi;
import static org.jooq.impl.Keywords.F_DEGREES;
import static org.jooq.impl.Tools.castIfNeeded;

import java.math.BigDecimal;

import org.jooq.Context;
import org.jooq.Field;

/**
 * @author Lukas Eder
 */
final class Degrees extends AbstractField<BigDecimal> {

    /**
     * Generated UID
     */
    private static final long serialVersionUID = -7273879239726265322L;

    private final Field<?>    argument;

    Degrees(Field<?> argument) {
        super(DSL.name("degrees"), SQLDataType.NUMERIC);

        this.argument = argument;
    }

    @Override
    public final void accept(Context<?> ctx) {
        switch (ctx.family()) {









            case FIREBIRD:
            case SQLITE:
                ctx.visit(castIfNeeded(argument, BigDecimal.class).mul(inline(180)).div(pi()));
                break;

            default:
                ctx.visit(F_DEGREES).sql('(').visit(argument).sql(')');
                break;
        }
    }
}
