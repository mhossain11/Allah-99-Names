package com.example.allah99name.model

data class ItemModel(  //Data
    var num:String,
    val name:String,
    val arabic_Trlt:String="",
    val bangla_Trlt: String =""

)

val ItemList = arrayListOf<ItemModel>(  //Data List
    ItemModel("01","الله","আল্লাহ",""),
    ItemModel("02","الرَّحْمَنُ","আর-রহমান","পরম দয়ালু, পরম করুণাময়, সবচেয়ে দয়ালু, কল্যাণময়"),
    ItemModel("03","الرحيم","আর-রাহীম","অতিশয়-মেহেরবান, অতি দয়ালু"),
    ItemModel("04","الْمَلِكُ","আল-মালিক","সর্বকর্তৃত্বময়, অধিপতি, মালিক"),
    ItemModel("05","الْقُدُّوسُ","আল-কুদ্দুস","নিষ্কলুষ,অতি পবিত্র,নিখুঁত"),
    ItemModel("06","السَّلَامُ","আস-সালাম","শনিরাপত্তা-দানকারী, শান্তি-দানকারী, ত্রাণকর্তা, দোষমুক্ত"),
    ItemModel("07"," الْمُؤْمِنُ","আল-মু’মিন"," নিরাপত্তা ও ঈমান দানকারী, জামিনদার, সত্য ঘোষণাকারী"),
    ItemModel("08","الْمُهَيْمِنُ","আল-মুহাইমিন","পরিপূর্ন রক্ষণাবেক্ষণকারী, রক্ষক, অভিভাবক, প্রতিপালনকারী"),
    ItemModel("09","الْعَزِيزُ","আল-আ'জীজ","পরাক্রমশালী, অপরাজেয়, সর্বাধিক সম্মানিত, মহাসম্মানিত"),
    ItemModel("10","الْجَبَّارُ","আল-জাব্বার","দুর্নিবার, মহাপ্রতাপশালী, অতীব মহিমান্বিত"),
    ItemModel("11","الْمُتَكَبِّرُ","আল-মুতাকাব্বিইর","সর্বশ্রেষ্ঠ, গৌরবান্বিত,অহংকারী"),
    ItemModel("12","الْخَالِقُ","আল-খালিক্ব","সৃষ্টিকর্তা,সৃষ্টিকারী"),
    ItemModel("13","الْبَارِئُ","আল-বারী","সঠিকভাবে সৃষ্টিকারী, নির্মাণকর্তা, পরিকল্পনাকারী"),
    ItemModel("14","الْمُصَوِّرُ","আল-মুছউইর","আকৃতি-দানকারী"),
    ItemModel("15","الْغَفَّارُ","আল-গফ্ফার","পরম ক্ষমাশীল, অতি ক্ষমাশীল"),
    ItemModel("16","الْقَهَّارُ","আল-ক্বাহার","কঠোর, মহাপ্রতাবশালী, দমনকারী"),
    ItemModel("17","الْوَهَّابُ","আল-ওয়াহ্হাব ","সবকিছু দানকারী, দানশীল, স্থাপনাকারী"),
    ItemModel("18","الرَّزَّاقُ","আর-রজ্জাক্ব","রিযিকদাতা"),
    ItemModel("19","الْفَتَّاحُ","আল-ফাত্তাহ","বিজয়দানকারী, শ্রেষ্ঠ ফয়সালাকারী, প্রারম্ভকারী"),
    ItemModel("20","الْعَلِيمُ","আল-আ'লীম","সর্বজ্ঞ, মহাজ্ঞানী"),
    ItemModel("21","الْقَابِضُ","আল-ক্ববিদ্ব'","নিয়ন্ত্রণকারী, সরলপথ প্রদর্শনকারী"),
    ItemModel("22","الْبَاسِطُ","আল-বাসিত"," প্রশস্তকারী"),
    ItemModel("23","الْخَافِضُ","আল-খফিদ্বু"," (অবিশ্বাসীদের)অপমানকারী"),
    ItemModel("24","الرَّافِعُ ُ","আর-রফীই","উন্নতকারী, উঁচুকারী"),
    ItemModel("25","الْمُعِزُّ"," আল-মুই'জ্ব ","সম্মান-দানকারী"),
    ItemModel("26","الْمُذِلُّ","আল-মুদ্বি'ল্লু\n(আল-মুযিল্ল)","(অবিশ্বাসীদের) বেইজ্জতকারী"),
    ItemModel("27","السَّمِيعُ","আস্-সামিই'","সর্বশ্রোতা"),
    ItemModel("28","الْبَصِيرُ","আল-বাছীর","সর্বদ্রষ্টা, সর্ববিষয়-দর্শনকারী"),
    ItemModel("29","الْحَكَمُ","আল-হা'কাম ","অটল বিচারক, মহা বিচারপতি, হুকুমদাতা"),
    ItemModel("30","الْعَدْلُ","আল-আ'দল","নপরিপূর্ণ-ন্যায়বিচারক, নিখুঁত, ন্যায় বিচারক"),
    ItemModel("31","اللَّطِيفُ","আল-লাতীফ","সকল-গোপন-বিষয়ে-অবগত, সূক্ষ্মদর্শী, অমায়িক"),
    ItemModel("32","الْخَبِيرُ","আল-খ'বীর ","সকল ব্যাপারে জ্ঞাত, সর্বজ্ঞ,সম্যক অবগত"),
    ItemModel("33","الْحَلِيمُ","আল-হা'লীম"," অত্যন্ত ধৈর্যশীল, মহা সহনশীল, প্রশ্রয়দাতা"),
    ItemModel("34","الْعَظِيمُ","আল-আ'জীম","সর্বোচ্চ-মর্যাদাশীল, মহা মর্যাদাপূর্ণ, অতি বিরাট"),
    ItemModel("35","الْغَفُورُ","আল-গফুর","পরম ক্ষমাশীল, মার্জনাকারী, অতীব ক্ষমাশীল"),
    ItemModel("36","الشَّكُورُ","আশ্-শাকুর","গুনগ্রাহী, সুবিবেচক"),
    ItemModel("37"," الْعَلِيُّ","আল-আ'লিইউ","উচ্চ-মর্যাদাশীল"),
    ItemModel("38","الْكَبِيرُ","আল-কাবিইর ","সুমহান, অতি বিরাট"),
    ItemModel("39","الْحَفِيظُ","আল-হা'ফীজ ","সংরক্ষণকারী"),
    ItemModel("40","الْمُقِيتُ","আল-মুক্বীত","সকলের জীবনোপকরণ-দানকারী, সংরক্ষণকারী, লালনপালনকারী"),
    ItemModel("41","الْحَسِيبُ","আল-হাসীব","হিসাব-গ্রহণকারী"),
    ItemModel("42","الْجَلِيلُ","আল-জালীল","পরম মর্যাদার অধিকারী,গৌরবান্বিত"),
    ItemModel("43","الْكَرِيمُ","আল-কারীম ","সুমহান দাতা, মহা সম্মানিত, মহা দয়ালু"),
    ItemModel("44","الرَّقِيبُ"," আর-রক্বীব"," সদা জাগ্রত,অতন্দ্র পর্যবেক্ষণকারী, তত্ত্বাবধায়ক"),
    ItemModel("45","الْمُجِيبُ","আল-মুজীব ","জবাব-দানকারী, সাড়া দানকারী, উত্তরদাতা, দো‘আ কবুলকারী"),
    ItemModel("46","الْوَاسِعُ","আল-ওয়াসি'","সর্ব-ব্যাপী, অসীম, ব্যাপক"),
    ItemModel("47","الْحَكِيمُ","আল-হাকীম","পরম-প্রজ্ঞাময়, সুবিজ্ঞ, সুদক্ষ"),
    ItemModel("48","الْوَدُودُ","আল-ওয়াদুদ","(বান্দাদের প্রতি) সদয়, প্রেমময়, পরম স্নেহশীল"),
    ItemModel("49","الْمَجِيدُ","আল-মাজীদ","সকল-মর্যাদার-অধিকারী, মহিমান্বিত, সম্মানিত"),
    ItemModel("50","الْبَاعِثُ"," আল-বাই'ছ'","পুনরুত্থানকারী,পুনুরুজ্জীবিতকারী"),
    ItemModel("51","الشَّهِيدُ","আশ-শাহীদ ","সর্বজ্ঞ-স্বাক্ষী, প্রত্যক্ষদর্শী,সাক্ষ্যদানকারী"),
    ItemModel("52","الْحَقُّ","আল-হা'ক্ব","পরম সত্য"),
    ItemModel("53","لْوَكِيلُ","আল-ওয়াকীল","পরম নির্ভরযোগ্য কর্ম-সম্পাদনকারী, তত্ত্বাবধায়ক, সহায় প্রদানকারী, আস্থাভাজন উকিল"),
    ItemModel("54","الْقَوِيُّ"," আল-ক্বউইউ"," পরম-শক্তির-অধিকারী"),
    ItemModel("55","الْمَتِينُ","আল মাতীন"," সুদৃঢ়, সুস্থির"),
    ItemModel("56","الْوَلِيُّ","আল-ওয়ালিইউ"," অভিভাবক ও সাহায্যকারী"),
    ItemModel("57","الْحَمِيدُ"," আল-হা'মীদ","সকল প্রশংসার দাবীদার, মহা প্রশংসনীয়"),
    ItemModel("58","الْمُحْصِي","আল-মুহছী","সকল সৃষ্টির ব্যপারে অবগত"),
    ItemModel("59","الْمُبْدِئُ","আল-মুব্দি","প্রথমবার-সৃষ্টিকর্তা, অগ্রণী, প্রথম প্রবর্তক"),
    ItemModel("60"," الْمُعِيدُ","আল-মু’ঈদ","পুনরায়-সৃষ্টিকর্তা"),
    ItemModel("61","الْمُحْيِيُ"," আল-মুহ'য়ী","জীবন-দানকারী"),
    ItemModel("62","الْمُمِيتُ","আল-মুমীত","ধ্বংসকারী, মৃত্যু-দানকারী"),
    ItemModel("63","الْحَيُّ","আল-হাইয়্যু","চিরঞ্জীব, যার কোন শেষ নাই"),
    ItemModel("64","الْقَيُّومُ","আল-ক্বাইয়্যুম","সমস্তকিছুর ধারক ও সংরক্ষণকারী"),
    ItemModel("65","الْوَاجِدُ","আল-ওয়াজিদ","অফুরন্ত ভান্ডারের অধিকারী"),
    ItemModel("66","المحيط","আল-মুহীত ","পরিবেষ্টনকারী, সর্ব বেষ্টনকারী"),
    ItemModel("67","الْوَاحِدُ","আল-ওয়াহি'দ","এক ও অদ্বিতীয়"),
    ItemModel("68","الصَّمَدُ"," আছ্-ছমাদ","অমুখাপেক্ষী,অবিনশ্বর, চিরন্তন, স্বয়ং সম্পূর্ণ"),
    ItemModel("69","الْقَادِرُ","আল-ক্বদির","সর্বশক্তিমান, মহা ক্ষমতাধর"),
    ItemModel("70","ُُُ الْمُقْتَدِرُ"," আল-মুক্বতাদির","প্রভাবশালী, সিদ্ধান্তগ্রহণকারী"),
    ItemModel("71","الْمُقَدِّمُ","আল-মুক্বদ্দিম"," অগ্রসারক, সর্বাগ্রে সহায়তা প্রদানকারী"),
    ItemModel("72"," الْمُؤَخِّرُ","আল-মুয়াক্খির","বিলম্বকারী, অবকাশ দানকারী"),
    ItemModel("73"," الْأَوَّلُ","আল-আউয়াল","অনাদি, প্রথম, যার কোন শুরু নাই"),
    ItemModel("74","الْآخِرُ","আল-আখির","অনন্ত,সর্বশেষ, যার কোন শেষ নাই"),
    ItemModel("75","الظَّاهِرُ","আজ-জ'হির","সম্পূর্নরূপে-প্রকাশিত, প্রকাশ্য"),
    ItemModel("76","الْبَاطِنُ"," আল-বাত্বিন","দৃষ্টি হতে অদৃশ্য, গোপন"),
    ItemModel("77"," الْوَالِيَ","আল-ওয়ালি ","সমস্ত কিছুর অভিভাবক"),
    ItemModel("78","الْمُتَعَالِي","আল-মুতাআ'লি ","সৃষ্টির গুনাবলীর উর্দ্ধে"),
    ItemModel("79","الْبَرُّ","আল-বার্","পরম-উপকারী, অণুগ্রহশীল, কল্যাণকারী"),
    ItemModel("80","التَّوَّابُ","আত্-তাওয়াব","তাওবার তাওফিক দানকারী এবং কবুলকারী, ক্ষমাকারী"),
    ItemModel("81"," الْمُنْتَقِمُ","আল-মুনতাক্বিম","প্রতিশোধ-গ্রহণকারী"),
    ItemModel("82","الْعَفُوُّ","আল-আ'ফঊ","পরম-উদার, শাস্তি মউকুফকারী, গুনাহ ক্ষমাকারী, পাপ মোচনকারী"),
    ItemModel("83","الرَّءُوفُ","আর-রউফ","পরম-স্নেহশীল, সদয়, সমবেদনা প্রকাশকারী, দয়াশীল"),
    ItemModel("84","مَالِكُ الْمُلْكِ","মালিকুল-মুলক","সমগ্র জগতের বাদশাহ্"),
    ItemModel("85","ذُو الْجَلَالِ وَالْإِكْرَامُِ","যুল-জালালি-ওয়াল-ইকরাম","হিমান্বিত ও দয়াবান সত্তা, মহা মর্যাদাবান, মহা মহত্ত্ব ও মহা সম্মানিত"),
    ItemModel("86","الْمُقْسِطُ","আল-মুক্ব্সিত","হকদারের হক-আদায়কারী"),
    ItemModel("87"," الْجَامِعُ","আল-জামিই'","একত্রকারী, সমবেতকারী"),
    ItemModel("88"," الْغَنِيُّ","আল-গণিই'","অমুখাপেক্ষী ধনী"),
    ItemModel("89","الْمُغْنِيُ","আল-মুগণিই'","পরম-অভাবমোচনকারী, সমৃদ্ধকারী, উদ্ধারকারী"),
    ItemModel("90"," الْمَانِعُ","আল-মানিই'","অকল্যাণরোধক, প্রতিরোধকারী, রক্ষাকর্তা, নিষেধকারী, বারণকারী"),
    ItemModel("91","الضَّارُّ "," আয্-যর","ক্ষতিসাধনকারী, যন্ত্রনাদানকারী, উৎপীড়নকারী"),
    ItemModel("92"," النَّافِعُ","আন্-নাফিই'","কল্যাণকারী, অনুগ্রাহক, উপকারকারী, হিতকারী"),
    ItemModel("93","النُّورُ","আন্-নূর","পরম-আলো, আলোক"),
    ItemModel("94","الْهَادِيُ","আল-হাদী","পথ-প্রদর্শক, হিদায়েতকারী"),
    ItemModel("95","الْبَدِيعُ"," আল-বাদীই'","অতুলনীয়"),
    ItemModel("96","الْبَاقِيُ","আল-বাক্বী","চিরস্থায়ী, অবিনশ্বর"),
    ItemModel("97","الْوَارِثُ ","আল-ওয়ারিস'","উত্তরাধিকারী"),
    ItemModel("98","الرَّشِيدُ","আর-রাশীদ","সঠিক পথ-প্রদর্শক, বিচক্ষণ, সচেতন"),
    ItemModel("99","الصَّبُورُ","আস-সবুর","অত্যধিক ধৈর্যধারণকারী")


)

