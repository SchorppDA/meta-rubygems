# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: aws-sdk-securityhub"
DESCRIPTION = "Official AWS Ruby gem for AWS SecurityHub"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-aws-sdk-core-native \
    rubygems-aws-sigv4-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "293332d73340303ddd987597dd5134e0"
SRC_URI[sha256sum] = "4140d23a00676ca31df79c00e5e95a9910418d1486ab4abde67eab016f8675ff"

GEM_NAME = "aws-sdk-securityhub"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-aws-sdk-core \
    rubygems-aws-sigv4 \
"

BBCLASSEXTEND = "native"