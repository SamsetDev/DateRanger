# DateRanger
Date range picker




<h1>Live Sample</h1>

![output_4dloif](https://cloud.githubusercontent.com/assets/12843976/19115372/53499332-8b2f-11e6-8da2-63b98b1f708f.gif)

<h1>Credits</h1>

Author: Sanjay Singh 

<a href="http://www.facebook.com/sharer.php?u=https://github.com/SamsetDev/DateRanger" class="socialBtn socialBtn--facebook">Share on Facebook</a><br>
<a href="https://plus.google.com/share?url=https://github.com/SamsetDev/DateRanger" class="socialBtn socialBtn--facebook">Share on Google plus</a>

<h2>Utilities</h2>

           ((TextView) view).setTypeface(null, Typeface.NORMAL);
            ((TextView) view).setTextColor(Color.BLACK);

            if (month != today.getMonth() || year != today.getYear()) {
                // if this day is outside current month, grey it out
                ((TextView) view).setTextColor(getResources().getColor(R.color.grey));
            } else if (day == today.getDate()) {
                // if it is today, set it to blue/bold
                ((TextView) view).setTypeface(null, Typeface.BOLD);
                ((TextView) view).setTextColor(getResources().getColor(R.color.current));
            }

               You can edit your own design and style
            ((TextView) view).setBackgroundColor(Color.parseColor("#fbdcbb"));
            ((TextView) view).setTextColor(Color.parseColor("#040404"));
            ((TextView) view).setLayoutParams(new GridView.LayoutParams(144, 144));
            


<h1>License</h1>

Copyright 2016 Sanjay Singh.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

