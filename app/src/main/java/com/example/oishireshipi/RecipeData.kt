package com.example.oishireshipi

import android.content.res.Resources
import android.provider.Settings.Global.getString
import android.provider.Settings.Secure.getString
import android.provider.Settings.System.getString
import androidx.core.content.res.TypedArrayUtils.getResourceId
import androidx.core.content.res.TypedArrayUtils.getString
import com.bumptech.glide.load.engine.Resource
import java.security.AccessController.getContext

object RecipeData {

    private val recipeNames = arrayOf("Matcha Mille Crepes",
    "Baked Rice",
    "Castella Cake",
    "Avocado Cream Cheese",
    "Milk Streak Cake",
    "Fruity Pudding",
    "Pumpkin Cake",
    "Chocolava Bread",
    "Banana Cinnamon Pancakes",
    "Coffe  Skippy Cake")



    private val recipeDetails  = arrayOf("Bahan\n" +
            "400 ml fresh milk (UHT)\n" +
            "3 sdm gula pasir\n" +
            "3 butir telur ukuran besar\n" +
            "25 gram butter, lelehkan\n" +
            "138 gram tepung protein rendah\n" +
            "12 gram matcha powder\n" +
            "1/2 sdt baking powder\n" +
            "sedikit minyak utk olesan teflon\n" +
            "\n" +
            "Filling\n" +
            "240 ml whipping cream cair\n" +
            "3 sdm gula pasir\n" +
            "Mixer ke dua bahan ini hingga flufy\n" +
            "\n" +
            "Cara membuat:\n" +
            "1.\tHangatkan susu cair dan gula pasir diatas api kecil sebentar tdk sampai mendidih hangat\" kuku saja, angkat dan sisihkan\n" +
            "2.\tDalam wadah lain kocok telur gunakan whisk lalu masukkan susu hangat tadi perlahan\" dan bertahap\n" +
            "3.\tMasukkan lelehan butter aduk rata\n" +
            "4.\tMasukkan campuran antara tepung, bubuk matcha dan baking powder sambil diayak bersamaan dan bertahap, aduk hingga rata dan tidak bergerindil\n" +
            "5.\tKemudian saring, cover dengan plastik wrap lalu masukkan kulkas selama 1 jam\n" +
            "6.\tPanaskan wajan teflon api kecil, oles minyak lalu tuang 1 sendok sayur dan goyangkan hingga membentuk bulatan tipis, masak hingga matang di ke dua sisi.\n" +
            "7.\tLakukan hingga adonan habis, terakhir bikin 1 bulatan yg lebih besar\n" +
            "8.\tSetelah dingin siapkan piring datar besar lalu alasi plastik lebar dan taruh bulatan yg terbesar di dasar olesi dng filling lalu tumpuk dengan bulatan yg lebih kecil taruh filling lagi lakukan hingga habis dan yg paling atas jng di taruh filling lagi\n" +
            "9.\tKemudian bungkus dengan plastik yg jadi alas diatas piring tadi membentuk bulatan lalu ikat, taruh dalam wadah cekung dan masukkan kulkas selama 2 jam saja hingga benar\" set\n" +
            "10.\tKluarkan dan tengkurapkan diatas piring saji lalu taburi sedikit matcha diatasnya sbg hiasan, bisa disajikan dengan vla buah atau whipping cream.\n",
    "Bahan :\n" +
            "1 piring nasi\n" +
            "1/2 buah bombay cincang\n" +
            "1 buah wortel serut\n" +
            "Sedikit brokoli cincang\n" +
            "Sosis secukupnya potong2\n" +
            "1 buah telur\n" +
            "50 gram keju cheddar parut\n" +
            "2 sdm butter\n" +
            "Keju mozarella secukupnya\n" +
            "Garam dan merica sesuai selera\n" +
            "\n" +
            "Cara membuat :\n" +
            "1.\tPanaskan butter masukkan telur orak arik lalu masukkan bombay, sosis dan sayuran\n" +
            "2.\tSetelah sayuran layu masukkan nasi dan keju chedar aduk rata bumbui garam dan merica sesuai selera\n" +
            "3.\tSetelah matang masukkan ke wadah tahan panas. Lalu beri topping keju mozarela lalu oven dengan api atas saja hingga keju leleh. Sajikan\n",
    "Bahan:\n" +
            "5 butir telur ayam\n" +
            "180 gram gula pasir\n" +
            "200 gram tepung terigu protein rendah\n" +
            "80 ml susu cair\n" +
            "20 ml air perasan lemon\n" +
            "4 sendok makan madu\n" +
            "6 sendok makan minyak goreng\n" +
            "1/2 sendok teh kulit lemon parut\n" +
            "margarin secukupnya untuk mengolesi loyang\n" +
            "kertas roti secukupnya\n" +
            "cling wrap secukupnya\n" +
            "Taburan:\n" +
            "1 sendok makan madu\n" +
            "1 sendok makan gula pasir\n" +
            "\n" +
            "Cara membuat\n" +
            "1.\tOlesi loyang dengan margarin, kemudian alasi dengan kertas roti. Taburi dasarnya dengan gula pasir.\n" +
            "2.\tKocok telur ayam dan gula pasir dengan mixer hingga putih, mengembang, dan kaku.\n" +
            "3.\tTurunkan kecepatan mixer, kemudian masukkan tepung terigu sedikit demi sedikit. Lanjutkan dengan susu dan air lemon.\n" +
            "4.\tMatikan mixer, lalu masukkan minyak goreng dan madu. Aduk rata dengan spatula.\n" +
            "5.\tTuangkan adonan castella ke dalam loyang yang sudah dialasi kertas roti.\n" +
            "6.\tPanggang adonan kue di oven dengan suhu 170 derajat Celcius selama 40 menit.\n" +
            "7.\tJika kue sudah matang, segera keluarkan dari loyang tanpa mengelupas kertas roti.\n" +
            "8.\tSelagi castella masih panas dan terbungkus kertas roti, segera bungkus dengan cling wrap.\n" +
            "9.\tDiamkan semalaman agar cake menjadi lembap.\n" +
            "10.\tKeesokan harinya, buka cling wrap dan kertas roti, lalu olesi permukaan castella dengan madu.\n",
    "Bahan I:\n" +
            "2 bks oreo 130 gr ( buang isi nya dan hancurkan )\n" +
            "75 gr Unsalted butter\n" +
            "\n" +
            "Bahan II (alpokat creamcheese) :\n" +
            "150 gr tepung gula\n" +
            "300 gr creamcheese\n" +
            "50 ml air lemon\n" +
            "400 gr daging alpokat\n" +
            "200 gr whiped cream\n" +
            "1.5 bks gelatin (me: merek knox)\n" +
            "60 ml air\n" +
            "\n" +
            "Cara membuat:\n" +
            "1.\tCampur oreo dan unsalted butter aduk rata kemudian cetak di loyang bulat bongkar pasang ukuran 20 cm dan masukan ke dlm kulkas\n" +
            "2.\tCampurkan air dan gelatin kemudian di tim\n" +
            "3.\tBlender creamcheese, alpokat, tepung gula dan air lemon\n" +
            "4.\tMixer whiped cream sampai kembang\n" +
            "5.\tCampurkan daging alpokat yang sudah di blender tadi ke dalam whiped cream dan aduk rata\n" +
            "6.\tCampurkan gelatin yang sudah di tim td ke dalam alpokat yang sudah di campur whiped cream tadi dan aduk rata\n" +
            "7.\tMasukan ke dlm loyang yang sudah di bentuk crust nya\n" +
            "8.\tSimpan di dalam kulkas 4-5 jam atau 1 malam",
    "Bahan :\n" +
            "22 butir kuning telur\n" +
            "8 butir putih telur (kalau pake telur negri 6 butir)\n" +
            "400 gr butter me merek triangle\n" +
            "100 gr margarin blueband\n" +
            "350 gr gula halus ( resep asli bisa 500grm ya/sesuaikan selera manisnya)\n" +
            "200 gr terigu segitiga, ayak\n" +
            "1/2 kaleng susu kental manis putih\n" +
            "2 sdm susu bubuk\n" +
            "vanili bubuk\n" +
            "\n" +
            "Cara membuat:\n" +
            "1.\tkocok mentega, margarin gula halus dan vanili sampai mengembang, masukan satu persatu kuning telur sambil di mikser hingga mengembang dan tercampur rata.\n" +
            "2.\tmasukan susu kental manis, mikser asal tercampur, masukan susu bubuk dan terigu bertahap aduk perlahan.\n" +
            "3.\tmikser putih telur sampai mengembang kaku, campur ke adonan, aduk hingga rata.\n" +
            "4.\tOles loyang 20cm dengan butter taburi tepung sampai rata. kertas baking.\n" +
            "5.\tambil adonan 1 cangkir gelas kopi aduk rata, tuang ke loyang, ratakan.\n" +
            "6.\tpanggang dengan suhu  180-200 °C api atas hingga mulai sedikit kecoklatan, beri motif coklat dengan cara melingkar seperti obat nyamuk, panggang hingga kecoklatan.\n" +
            "7.\ttekan2 dengan penekan alat lapis yg dioles butter sedikit. lakukan hingga adonan habis.\n" +
            "8.\tbiarkan sampai dingin potong² sesuai selera..",
    "Bahan:\n" +
            "Tepung agar\" (sparrow)1 bks + 1st\n" +
            "Nutrijel plain 1 bks\n" +
            "Gula pasir 350 gr\n" +
            "Lemon 1/1,5 biji (peras airnya)\n" +
            "Air 1400 ml\n" +
            "buah tergantung selera\n" +
            "(kiwi, anggur, mangga, jeruk mandarin kaleng)\n" +
            "\n" +
            "Cara membuat:\n" +
            "1.\tTata setengah bagian buah diloyang, sisihkan dl\n" +
            "2.\tAduk tepung agar\" , nutrijel, gula pasir hingga rata, masukkan air, aduk lg hingga rata br nyalakan api\n" +
            "3.\tMasak dgn api sedang hingga hampir mendidih, masukkan perasan lemon, stlh mendidih hilangkan uap panas sebentar dgn cara diaduk\" baru tuang agar\" keloyang\n" +
            "4.\tMasukkan lg sisa buah tadi, biarkan suhu ruang baru simpan kulkas",
    "Bahan:\n" +
            "200 gr labu kuning kukus, haluskan\n" +
            "35 gr susu kental manis\n" +
            "4 butir telur\n" +
            "1 sdt SP\n" +
            "130 gr gula pasir\n" +
            "140 gr tepung terigu ayak\n" +
            "130 gr mentega leleh\n" +
            "35 gr kenari untuk topping\n" +
            "\n" +
            "Cara membuat:\n" +
            "1.\tCampur susu kental manis dengan labu kuning halus, sisihkan.\n" +
            "2.\tKocok telur dan gula sampai mengembang, putih berjejak.\n" +
            "3.\tTuang tepung terigu yang sudah di ayak, aduk balik atau pakai mikser speed rendah sebentar saja.\n" +
            "4.\tLanjut tuang labu halus, aduk rata dengan mixer speed rendah sebentar saja.\n" +
            "5.\tTuang mentega cair, aduk balik, pastikan mentega tidak mengendap didasar bowl.\n" +
            "6.\tTuang kedalam loyang yang sudah dioles margarin dan tabur tepung tipis2.\n" +
            "7.\tTabur topping sesuai selera.\n" +
            "8.\tPanggang suhu 160 derajat 50 menit, sesuaikan oven masing2.",
    "Bahan A:\n" +
            "250 g tepung terigu protein tinggi\n" +
            "20 g ChefMate Cocoa Powder\n" +
            "75 g KIS Gula Halus\n" +
            "6 g ragi instan\n" +
            "2 btr kuning telur\n" +
            "75 g susu UHT full cream dingin\n" +
            "65 g air\n" +
            "\n" +
            "Bahan B:\n" +
            "40 g butter\n" +
            "5 g garam\n" +
            "\n" +
            "Bahan Topping:\n" +
            "50 g butter\n" +
            "50 g KIS Gula Halus\n" +
            "70 g tepung terigu protein tinggi\n" +
            "10 g ChefMate Cocoa Powder\n" +
            "½ sdt Baking Powder\n" +
            "\n" +
            "Bahan Filling:\n" +
            "150 g ChefMate Dark Chocolate Compound\n" +
            "150 g whipped cream\n" +
            "\n" +
            "Cara membuat:\n" +
            "1.\tAduk semua Bahan A, uleni sampai bergumpal. Tambahkan Bahan B, uleni sampai kalis dan elastis. Diamkan 15 menit.\n" +
            "2.\tPotong dan  timbang 100 gram, bulatkan. Sisihkan.\n" +
            "3.\tBahan Topping: Aduk semua bahan menjadi satu. Timbang potong 25 gram.\n" +
            "4.\tFilling : Panaskan whipped cream, masukkan ChefMate Dark Chocolate Compound, aduk hingga cokelat meleleh. Angkat.\n" +
            "5.\tHias sesuai selera",
    "Bahan:\n" +
            "100 gr pisang\n" +
            "1 telur\n" +
            "1 tbsp gula\n" +
            "1/2 tsp cinnamon\n" +
            "40 gr susu\n" +
            "4 tbsp cassava flour\n" +
            "1,5 tbsp oat flour\n" +
            "1 tsp baking soda\n" +
            "1 tbsp olive oil\n" +
            "\n" +
            "Cara membuat:\n" +
            "1. Lumatkan pisang dengan garpu, tambahkan semua bahan basah lainnya, aduk rata.\n" +
            "2. Tambahkan semua bahan kering ke bahan basah (diayak), aduk asal rata.\n" +
            "3. Panaskan pan anti lengket, masak pancakes dengan api sedang, balik saat sudah banyak bubbles.\n" +
            "4. Angkat jika kedua sisi sudah kecoklatan.\n" +
            "5. Sajikan hangat dengan topping sesuai selera.",
    "Bahan I:\n" +
            "3 btr telur\n" +
            "50 gr gula\n" +
            "½ sdt emulsifier\n" +
            "65 gr tep. kunci biru\n" +
            "10 gr susu bubuk\n" +
            "75gr butter cair ( me : margarin )\n" +
            "2sch luwak white coffee ( me : 3 mini sachet nescafe classic )\n" +
            "\n" +
            "Bahan II (Skippy Cream Sauce):\n" +
            "65gr selai skippy\n" +
            "35gr whip cream cair\n" +
            "40gr susu cair plain\n" +
            "\n" +
            "Cara membuat:\n" +
            "1.\tMixer telur + gula + emulsi sampai mengembang kental berjejak.\n" +
            "2.\tMasuk tep + susu sambil diayak..mixer kec.plg rndh sampai rata saja.\n" +
            "3.\tLelehkan butter + kopi.\n" +
            "4.\tMasukkan ke adonan..aduk balik sampai rata. Jangan overmix. Tuang ke loyang yg sdh dioles margarin.\n" +
            "5.\tPanggang suhu 175° selama kurleb 40mnt api atas bwh ( sesuaikan oven msg2x ).\n" +
            "6.\tRebus dengan api kecil semua bahan II sampai rata saja..tdk perlu sampai mendidih letup2x. Siramkan ke atas cake.\n" +
            "7.\tBeri topping kacang panggang / sesuai selera.")


    private val recipeImages = intArrayOf(R.drawable.matcha,
    R.drawable.bakedrice,
    R.drawable.castella,
    R.drawable.avocado,
    R.drawable.milkstreak,
    R.drawable.pudding,
    R.drawable.pumpkin,
    R.drawable.chocolava,
    R.drawable.banana,
    R.drawable.coffe)

    val listData: ArrayList<Recipe>
        get() {
            val list = arrayListOf<Recipe>()
            for (position in recipeNames.indices){
                val recipe = Recipe()
                recipe.name = recipeNames[position]
                recipe.detail = recipeDetails[position]
                recipe.photo = recipeImages[position]
                list.add(recipe)
            }

            return list
        }
}

