# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: google-apis-storage_v1"
DESCRIPTION = "This is the simple REST client for Cloud Storage JSON API V1"
HOMEPAGE = "https://github.com/google/google-api-ruby-client"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7e6820981d59cdfac1e6538d3aacfd11"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-google-apis-core-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "0230d948c05980175d484e6a586256a3"
SRC_URI[sha256sum] = "084812bc11a2fa2238ad6506ba54895a2eabb35ef7feafdb3a2bbead5632f92d"

GEM_NAME = "google-apis-storage_v1"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-google-apis-core \
"

BBCLASSEXTEND = "native"
