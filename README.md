# meta-rubygems

A layer providing gems for Ruby.

## Tested variants

The following variants are tested regularly:

| variant   | glibc                                                                                                                                         |
| --------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| qemuarm64 | ![[master]-[glibc]-[qemuarm64]](https://github.com/priv-kweihmann/meta-rubygems/workflows/%5Bmaster%5D-%5Bglibc%5D-%5Bqemuarm64%5D/badge.svg) |

Other variants most likely will work.
Feel free to contribute any needed patches.

### Tested revisions

Up to the following revisions automated checks being performed

* poky: b398c7653ec6272178dd6403dfcadf475f677bf5
* meta-openembedded: 0e3f5e5201e3b9740b74df76a2a907983cc8b4e3

## Support

This layer is a rolling release.
Integration is continuously checked against the respective [revisions](#tested-revisions) of the corresponding layers.
Don't expect tags or any kind of versioning.

### poky release mapping

please check the following table to pick the correct branch matching your poky version

| poky release | suggested meta-rubygems branch | ruby version | maintainer     |
| ------------ | ------------------------------ | ------------ | -------------- |
| master       | master                         | 3.2.x        | priv-kweihmann |
| kirkstone    | kirkstone                      | 3.1.x        | n.a.           |
| honister     | hardknott                      | 3.0.x        | n.a.           |
| hardknott    | hardknott                      | 3.0.x        | n.a.           |
| gatesgarth   | dunfell                        | 2.7.x        | n.a.           |
| dunfell      | dunfell                        | 2.7.x        | n.a.           |
| zeus         | zeus                           | 2.5.x        | n.a.           |

## License

This layer is licensed under `MIT & BSD-2-Clause`.
Newly-added recipes are licensed exclusively under `MIT`.

## Add a new gem

Please see [the development README](scripts/README.md) for details.
Also please mind the [contribution guidelines](CONTRIBUTING.md)
