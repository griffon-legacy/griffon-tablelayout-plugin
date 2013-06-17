
TableLayout integration
-----------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/tablelayout](http://artifacts.griffon-framework.org/plugin/tablelayout)


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

