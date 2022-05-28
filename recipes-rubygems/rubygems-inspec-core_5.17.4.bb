# SPDX-License-Identifier: MIT
SUMMARY = "RubyGem: inspec-core"
DESCRIPTION = "InSpec provides a framework for creating end-to-end infrastructure tests"
HOMEPAGE = "https://github.com/inspec/inspec"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38becae1e765aa7075044208bbab2ea4"

EXTRA_DEPENDS:append = " "
EXTRA_RDEPENDS:append = " "

DEPENDS:class-native += "\
    rubygems-addressable-native \
    rubygems-chef-telemetry-native \
    rubygems-faraday-middleware-native \
    rubygems-faraday-native \
    rubygems-hashie-native \
    rubygems-license-acceptance-native \
    rubygems-method-source-native \
    rubygems-mixlib-log-native \
    rubygems-multipart-post-native \
    rubygems-parallel-native \
    rubygems-parslet-native \
    rubygems-pry-native \
    rubygems-rspec-its-native \
    rubygems-rspec-native \
    rubygems-rubyzip-native \
    rubygems-semverse-native \
    rubygems-sslshake-native \
    rubygems-thor-native \
    rubygems-tomlrb-native \
    rubygems-train-core-native \
    rubygems-tty-prompt-native \
    rubygems-tty-table-native \
"

GEM_INSTALL_FLAGS:append = " "

SRC_URI[md5sum] = "eb9d40f2a06672a490c9c92f6b700251"
SRC_URI[sha256sum] = "e0f40ec0a13569067a50ee1fb5366d54a5e0318c2f2510e36fc09c51f723d89c"

GEM_NAME = "inspec-core"

inherit rubygems
inherit rubygentest
inherit pkgconfig

RDEPENDS:${PN}:class-target += "\
    rubygems-addressable \
    rubygems-chef-telemetry \
    rubygems-faraday \
    rubygems-faraday-middleware \
    rubygems-hashie \
    rubygems-license-acceptance \
    rubygems-method-source \
    rubygems-mixlib-log \
    rubygems-multipart-post \
    rubygems-parallel \
    rubygems-parslet \
    rubygems-pry \
    rubygems-rspec \
    rubygems-rspec-its \
    rubygems-rubyzip \
    rubygems-semverse \
    rubygems-sslshake \
    rubygems-thor \
    rubygems-tomlrb \
    rubygems-train-core \
    rubygems-tty-prompt \
    rubygems-tty-table \
"

BBCLASSEXTEND = "native"