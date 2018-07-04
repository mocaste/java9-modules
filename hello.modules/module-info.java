module hello.modules{
    exports com.mocaste.modules.hello;
    provides com.mocaste.modules.hello.HelloInterface with com.mocaste.modules.hello.HelloModules;
}