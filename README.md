
[![Build Status](https://travis-ci.org/alicanalbayrak/openvr.svg?branch=master)](https://travis-ci.org/alicanalbayrak/openvr)
# openvr 
Java OpenVR binding

In sync with original OpenVR 1.02. It includes several enhances, like:

- `read()` moved inside `(Pointer peer)` constructors
- `SIZE` on geometric classes, such as `HmdMatrix34_t`
- `dataSize()` on `RenderModel_TextureMap_t`
- `set(..)` methods to avoid new instantiation on classes such as `Texture_t`

Steps:

- add jars under `\lib`

Jogl hello vr [here](https://github.com/elect86/jogl-hello-vr)
