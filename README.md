# 20220629-spring-docker

とりあえず Docker Compose で Spring Boot Web アプリを動かしてみました。

動かし方。

```sh
docker compose up
```

[http://localhost/](http://localhost/) ([http://127.0.0.1/](http://127.0.0.1/)) にアクセスすると hello, world と表示されます。

/ 以外にアクセスすると 402 (と JSON) を返します。

Filter は Controller と違うので、[ResponseStatusException (Spring Framework 5.3.21 API)](https://docs.spring.io/spring-framework/docs/5.3.21/javadoc-api/org/springframework/web/server/ResponseStatusException.html) は使えないようです。

## 参考情報

- [Docker で Spring Boot - 公式サンプルコード](https://spring.pleiades.io/guides/gs/spring-boot-docker/)
- [（Spring）Filter と Interceptor の違い | NHN Cloud Meetup](https://meetup-jp.toast.com/698) 概要をつかめました。
