/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.material.catalog.textfield;

import androidx.annotation.LayoutRes;

import io.material.catalog.R;

/**
 * A fragment that displays the filled text field demos with start and end icons and controls for
 * the Catalog app.
 */
public class TextFieldEnclosedIconsDemoFragment extends TextFieldFilledDemoFragment {

  @Override
  @LayoutRes
  public int getTextFieldContent() {
    return R.layout.cat_textfield_enclosed_icons_content;
  }
}
