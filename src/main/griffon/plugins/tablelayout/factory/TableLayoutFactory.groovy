/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package griffon.plugins.tablelayout.factory

import groovy.swing.factory.LayoutFactory
import info.clearthought.layout.TableLayout

/**
 * @author Andres Almiray
 */
class TableLayoutFactory extends LayoutFactory {
    TableLayoutFactory() {
        super(TableLayout)
    }

    private def doubleParser = { e ->
        e instanceof Number ? e.doubleValue() : Double.parseDouble(String.valueOf(e))
    }

    Object newInstance(FactoryBuilderSupport builder, Object name, Object value, Map attributes) {
        List c = attributes.remove('columns') ?: [TableLayout.PREFERRED]
        List r = attributes.remove('rows') ?: [TableLayout.PREFERRED]

        double[] cols = c.collect([], doubleParser) as double[]
        double[] rows = r.collect([], doubleParser) as double[]

        new TableLayout(cols, rows)
    }
}
