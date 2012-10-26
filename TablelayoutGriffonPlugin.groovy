/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class TablelayoutGriffonPlugin {
    // the plugin version
    String version = '1.0.0'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '1.0.0 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [swing: '1.0.0']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-tablelayout-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'TableLayout integration'
    String description = '''
Provides integration with [TableLayout][1].

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| Node         | Property | Type | Default                 | Required | Bindable |
| ------------ | -------- | ---- | ----------------------- | -------- | -------- |
| jtableLayout | columns  | List | [TableLayout.PREFERRED] | yes      | no       |
|              | rows     | List | [TableLayout.PREFERRED] | no       | no       |

### Example

        import info.clearthought.layout.TableLayout

        double b = 10  // border
        double f = TableLayout.FILL
        double p = TableLayout.PREFERRED
        double vs = 5  // vertical space between labels and text fields
        double vg = 10 // vertical gap between form elements
        double hg = 10 // horizontal gap between form elements

        application(title: 'TableLayout Example',
          pack: true, resizable: false, locationByPlatform:true,
          iconImage: imageIcon('/griffon-icon-48x48.png').image,
          iconImages: [imageIcon('/griffon-icon-48x48.png').image,
                       imageIcon('/griffon-icon-32x32.png').image,
                       imageIcon('/griffon-icon-16x16.png').image]) {
            jtableLayout(columns: [b, f, hg, p, hg, p, b],
                        rows:     [b, p, vs, p, vg, p, vs, p, vg, p, vs, p, vg, p, b])
            label('Name',          constraints: '1,  1, 5, 1')
            textField(columns: 10, constraints: '1,  3, 5, 3')
            label('Address',       constraints: '1,  5, 5, 5')
            textField(columns: 20, constraints: '1,  7, 5, 7')
            label('City',          constraints: '1,  9')
            textField(columns: 10, constraints: '1, 11')
            label('State',         constraints: '3,  9')
            textField(columns: 2,  constraints: '3, 11')
            label('Zip',           constraints: '5,  9')
            textField(columns: 5,  constraints: '5, 11')
            panel(                 constraints: '1, 13, 5, 13') {
                button('Ok')
                button('Cancel')
            }
        }


[1]: http://java.net/projects/tablelayout
'''
}
