package com.github.tototoshi.play.social.twitter

import com.github.tototoshi.play.social.core.OAuth10aController
import jp.t2v.lab.play2.auth.{ Login, AuthConfig, OptionalAuthElement, LoginLogout }

trait TwitterOAuth10aController extends OAuth10aController
  with AuthConfig
  with OptionalAuthElement
  with Login
