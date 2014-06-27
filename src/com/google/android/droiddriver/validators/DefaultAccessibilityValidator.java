/*
 * Copyright (C) 2013 DroidDriver committers
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.droiddriver.validators;

import android.text.TextUtils;

import com.google.android.droiddriver.UiElement;
import com.google.android.droiddriver.actions.Action;

/**
 * Fall-back Validator for accessibility.
 */
public class DefaultAccessibilityValidator implements Validator {
  @Override
  public boolean isApplicable(UiElement element, Action action) {
    return true;
  }

  @Override
  public String validate(UiElement element, Action action) {
    return hasContentDescriptionOrText(element) ? null : "no content description or text";
  }

  private boolean hasContentDescriptionOrText(UiElement element) {
    return !TextUtils.isEmpty(element.getContentDescription())
        || !TextUtils.isEmpty(element.getText());
  }
}