# jopenvr
Java OpenVR binding

In sync with original OpenVR 1.02 plus several enhances, like:

- `read()` moved inside `(Pointer peer)` constructors
- `SIZE` on geometric classes, such as `HmdMatrix34_t`
- `dataSize()` on `RenderModel_TextureMap_t`
- `set(..)` methods to avoid new instantiation on classes such as `Texture_t`
