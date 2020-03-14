/*
 *    Copyright 2019 Ugljesa Jovanovic
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package com.ionspin.kotlin.bignum.integer.arithmetic

import com.ionspin.kotlin.bignum.integer.base32.BigInteger32Arithmetic
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlin.test.Test
import kotlin.test.assertTrue

/**
 * Created by Ugljesa Jovanovic
 * ugljesa.jovanovic@ionspin.com
 * on 16-Mar-2019
 */
@ExperimentalCoroutinesApi
@ExperimentalUnsignedTypes
class BigInteger32MultiplicationTest {

    @Test
    fun quick() {
        assertTrue {
            val a = uintArrayOf(10U)
            val b = uintArrayOf(20U)
            val c = BigInteger32Arithmetic.multiply(a, b)

            BigInteger32Arithmetic.compare(c, uintArrayOf(200U)) == 0
        }
    }

    @Test
    fun slow() {
        val a = uintArrayOf(
            600123930U, 2763064752U, 3767748705U, 2696295277U, 3753527898U, 1143743615U, 4128159603U,
            2272083234U, 315684520U, 970147242U, 1329509210U, 3492695163U, 3449361588U, 1278830002U, 3123489057U,
            3720277819U, 486484208U, 2780187700U, 1985022034U, 2285210218U, 3740982094U, 727015520U, 634515817U,
            2818084767U, 821469387U, 3809258124U, 2547242671U, 3070117665U, 2007653304U, 1148788934U, 277806579U,
            964103294U, 3959362403U, 3504818262U, 3616430151U, 2530148830U, 2473338298U, 4168739552U, 2546836734U,
            4005810033U, 4171219798U, 1321673836U, 3659491019U, 2088493223U, 2734433487U, 4181882457U, 2077080098U,
            3419003500U, 4088992956U, 2127002050U, 3878332648U, 159924315U, 2097087291U, 2360559702U, 2417342377U,
            902667771U, 230732034U, 382227801U, 2989852256U, 2804580808U, 2792478194U, 2233737899U, 2590596438U,
            1685787794U, 4029341876U, 2840867606U, 748209139U, 1713040567U, 3758180610U, 2018936643U, 3052757895U,
            3932780731U, 525542027U, 3928726637U, 792876150U, 1258736212U, 2934814626U, 993175008U, 3695691888U,
            652778597U, 4096799772U, 1709693670U, 401269799U, 1914221232U, 16543173U, 2039602020U, 2697157274U,
            2054981505U, 2671473621U, 1715088951U, 4095443647U, 925163206U, 3020627000U, 2170259467U, 796487592U,
            3174159575U, 1722117344U, 4153075827U, 381195856U, 1285964103U, 1684779334U, 3840008144U, 2995376514U,
            2075068780U, 417087274U, 3540403777U, 1434622140U, 3336025553U, 1592859507U, 3703206850U, 1454886635U,
            3066725284U, 2364138817U, 3527757888U, 533116442U, 1937535711U, 951770601U, 2284433471U, 3313840875U,
            61717927U, 2624868229U, 1494082706U, 4006538654U, 1486914769U, 1636612562U, 1288899021U, 134354446U,
            1367927629U, 1572506030U, 590563644U, 81066963U, 278433553U, 807067896U, 1254190248U, 216503963U,
            2234717647U, 2743820654U, 333174267U, 85681576U, 425563847U, 3208116762U, 3822846496U, 1081675282U,
            37632784U, 412989856U, 3986111236U, 1150681645U, 436927512U, 168304605U, 1699485485U, 609959634U,
            428381792U, 1844663280U, 4125356634U, 1862186047U, 3948452908U, 3264873623U, 4205259853U, 76864096U,
            2540045839U, 3758536668U, 3813199704U, 1726362399U, 1127535136U, 88029273U, 932809420U, 666259892U,
            2293955997U, 4022060697U, 1181631814U, 445388042U, 1105117808U, 445749829U, 933292907U, 3962043913U,
            3198583471U, 2135837857U, 4046878917U, 475610694U, 210998176U, 3491645221U, 3482811267U, 579351217U,
            4274867676U, 1798050774U, 926561670U, 721259347U, 1467334995U, 1084942089U, 322919607U, 2625852065U,
            2543262639U, 2130878562U, 3048421097U, 2810972011U, 1864896945U, 811641370U, 767537789U, 313806042U,
            1300025490U
        )

        val b = uintArrayOf(
            3040299697U, 1045410217U, 3715147702U, 3312156397U, 3318451442U, 3547759748U, 1380130571U,
            2986846560U, 3832546252U, 2349955818U, 3977264322U, 2104904855U, 2414778472U, 866326223U, 626161664U,
            2392978520U, 3291763678U, 2796314339U, 3365881313U, 3375178212U, 312879617U, 2139823425U, 2072841355U,
            1021042036U, 1326043243U, 3692578988U, 668382832U, 2274840681U, 3743898623U, 3243266285U, 986926332U,
            266437650U, 2214912911U, 2642762973U, 1628648398U, 3211809898U, 826485031U, 678831686U, 4008468742U,
            3233171893U, 2848195671U, 4161077349U, 2751551410U, 1154843384U, 1743095473U, 4115306756U, 1459961400U,
            2705255580U, 1731957052U, 4080291259U, 1550032283U, 3338838268U, 227889200U, 3971200909U, 3355101313U,
            408455661U, 517913238U, 1730307291U, 235883446U, 1823335986U, 118925069U, 1044634185U, 3555545671U,
            292990590U, 809551738U, 3262060024U, 1205618924U, 1392400302U, 4147220200U, 2095863163U, 2541620855U,
            1832915828U, 3633520955U, 3242899054U, 2794825995U, 3203712713U, 1396341883U, 3768780289U, 4188849683U,
            657945025U, 1430165162U, 2174318025U, 4058987749U, 629858386U, 3719814604U, 1590249399U, 2426478454U,
            1880860592U, 3517453278U, 1446469600U, 1748723660U, 2616963470U, 1320998351U, 1185394285U, 1053455781U,
            3591165524U, 29327829U, 2774383951U, 513458024U, 1032497067U, 1894507327U, 3103113990U, 1994000705U,
            3182535417U, 2936738018U, 1273572448U, 3801821581U, 4095844175U, 2365474559U, 1635224826U, 1115360336U,
            2957249682U, 1534367838U, 2448613102U, 3425858700U, 3781471471U, 3588683232U, 3891381218U, 3769891448U,
            1241730249U, 1941028737U, 3867287738U, 215404376U, 2041277379U, 2686761803U, 2265903269U, 3067354486U,
            1347312646U, 2518318463U, 2336134034U, 312871425U, 777875183U, 2347812569U, 1310300968U, 72731093U,
            1645129858U, 3266409192U, 127185291U, 4131913454U, 2215259867U, 664909262U, 1446713450U, 3801649710U,
            1189020167U, 2031709342U, 1752803655U, 1290132055U, 1030812203U, 933756620U, 2061607478U, 3211866967U,
            936504288U, 2457488653U, 2060245201U, 3826294654U, 3492500590U, 3796501443U, 3227394698U, 2126209601U,
            595959186U, 2921544323U, 3816005104U, 3752788822U, 292428312U, 3100030709U, 3410291983U, 4107759677U,
            2165879602U, 519210380U, 3383628734U, 3750042272U, 3450759663U, 1200938390U, 4142488489U, 874266439U,
            2911928439U, 76546969U, 586967232U, 4285659552U, 3582995518U, 3976495803U, 2767180981U, 409817535U,
            3303838269U, 227365500U, 1551089913U, 3378944462U, 1551263268U, 3512015567U, 3289520934U, 3726513383U,
            703411164U, 4108597669U, 1272432871U, 3986034594U, 82744064U, 925178848U, 2543003563U, 2961954712U,
            2919417310U
        )

        val c = uintArrayOf(
            655597562U, 91665514U, 3774875829U, 1998931269U, 1664386990U, 1250959074U, 159220293U,
            701675673U, 521562705U, 2534229486U, 3328471809U, 2793606047U, 1157916211U, 2122740866U, 1414162391U,
            1041348928U, 2704205968U, 3417506058U, 2264862520U, 178053684U, 1575721635U, 299016552U, 1158769670U,
            3174122233U, 1408962808U, 3909159712U, 3866682408U, 4141795307U, 1550232373U, 3589091336U, 3915234638U,
            2493780250U, 3488354302U, 3306003200U, 2248937367U, 1025684009U, 4075660971U, 2217368289U, 3094097428U,
            747988796U, 2345109840U, 1837849401U, 2519078668U, 1736748085U, 293088884U, 3448833670U, 2082432201U,
            1686357604U, 197761851U, 2954831001U, 4031834225U, 1301756201U, 2150703007U, 2660904672U, 665462564U,
            21219393U, 3854587861U, 1621452754U, 832313642U, 3655110979U, 195142096U, 4145671660U, 3584879357U,
            3276625009U, 667058792U, 486935841U, 1969600254U, 622589732U, 1006205967U, 2429718517U, 54110759U,
            4153168017U, 281154608U, 3897055871U, 82963098U, 258219222U, 545189166U, 388504734U, 2093619113U,
            2854285028U, 3633865527U, 1031926865U, 2431669189U, 224912789U, 856443510U, 3708376481U, 667264528U,
            8234295U, 234233327U, 2625487111U, 3256934475U, 43336527U, 1421318608U, 3301116756U, 662463643U,
            853106036U, 3925029139U, 3626184408U, 262549533U, 2580223337U, 2887420468U, 673069254U, 264369430U,
            2457262025U, 1930478517U, 3579092194U, 3295706545U, 3793822677U, 2819038250U, 3507402846U, 1701875735U,
            120256635U, 4043871707U, 1744160543U, 3611167253U, 3756242372U, 2580077790U, 723973314U, 577893015U,
            1613752675U, 839080120U, 2548110085U, 1941404954U, 4257714494U, 4248753126U, 3294511367U, 3079825852U,
            555756995U, 4125437117U, 3510270708U, 4169444948U, 3824906497U, 4182566465U, 4082619329U, 945686623U,
            514416723U, 3056532499U, 853560478U, 2509292064U, 1918908019U, 3606830211U, 2793760694U, 3776496786U,
            3609506990U, 1190120218U, 3948984685U, 4037712057U, 1145617597U, 3409050258U, 3113280315U, 1678852490U,
            269580832U, 3111326570U, 418875231U, 2122299206U, 372464755U, 1582973966U, 240632053U, 2753862667U,
            2096016074U, 2217335106U, 1961221980U, 1303652256U, 3567898741U, 1908423555U, 3941487680U, 2072544590U,
            79450748U, 3224602961U, 2995774533U, 1126116561U, 3339004012U, 129858078U, 1338377830U, 3418791768U,
            364897821U, 369734117U, 1683255679U, 1134048728U, 4278726046U, 2713118686U, 1761584365U, 2899011003U,
            3321859172U, 1466697936U, 3281544210U, 1242055767U, 3893520868U, 3695611628U, 1222670999U, 463367956U,
            693572076U, 1540451879U, 1659812274U, 333715138U, 1749342327U, 2033493987U, 3850503055U, 1157380816U,
            4203739541U, 1164182575U, 3258193778U, 1168808865U, 180898U, 143857779U, 137129375U, 1414766830U,
            3686489033U, 2564756523U, 941036089U, 646465641U, 3323791198U, 639633804U, 2166395370U, 412720846U,
            2821013975U, 2190620936U, 983337375U, 184824574U, 4059990624U, 267887094U, 1149006779U, 2302643068U,
            1251668333U, 3601262202U, 3226869635U, 2909201218U, 2142032954U, 2007038416U, 1326335854U, 4242349517U,
            2295740817U, 3242487948U, 2714602043U, 386297575U, 3788443483U, 1555827412U, 3736079801U, 870679086U,
            3935144060U, 492051565U, 520255622U, 458860254U, 1977500828U, 790405751U, 2879500743U, 1125541617U,
            2853480053U, 2273531723U, 264051610U, 1987340667U, 532422482U, 2972987006U, 286429502U, 3742427570U,
            1047646922U, 2467695781U, 3181251196U, 2073498157U, 2629923857U, 878051244U, 387722340U, 3340510552U,
            167966512U, 3480515444U, 3932996406U, 2968804511U, 1973554507U, 53007535U, 397500759U, 2893013886U,
            3934000671U, 3875465476U, 1585558398U, 930336283U, 2999166945U, 398342843U, 4068050306U, 2152845675U,
            3038769998U, 4063100061U, 1160263114U, 4141301602U, 804903501U, 3593859403U, 2179020185U, 11043737U,
            499638855U, 2154338861U, 2545201560U, 956121100U, 3574207873U, 4140405196U, 3520377796U, 1849886681U,
            1792919112U, 1463293489U, 3774747362U, 4166060506U, 4069337525U, 3795236566U, 2334609333U, 3150097497U,
            3642298671U, 2713110413U, 902405215U, 3766412102U, 3679803161U, 3867133008U, 1520549136U, 3551521762U,
            1500258454U, 198154747U, 3508662067U, 526730164U, 519368915U, 484388981U, 3765454825U, 1548763887U,
            2345975109U, 204409846U, 3142822558U, 417143556U, 3191533717U, 807032981U, 2809815306U, 140778506U,
            1838552112U, 1315707724U, 810429091U, 1581708906U, 3784901571U, 3890674826U, 739141247U, 3522775267U,
            2648176253U, 1323845999U, 2663158631U, 193041379U, 836322275U, 693103713U, 2009922055U, 2357786096U,
            188133950U, 3628990549U, 87029891U, 1889706930U, 2908244798U, 2537659659U, 1680447170U, 728817240U,
            4040565872U, 1597671449U, 3810346566U, 2326168562U, 2912392397U, 1548489630U, 577883415U, 1610143212U,
            1377219164U, 1583551042U, 1061245760U, 1888506733U, 2301697377U, 3671490961U, 2565426690U, 383913849U,
            2695748820U, 2436987154U, 2993103700U, 2948065917U, 1850120567U, 2157934063U, 179766310U, 3120034404U,
            2546825136U, 3503068421U, 3533319344U, 3394493504U, 1316061373U, 1182028641U, 2120814419U, 4072779859U,
            4031323624U, 868220705U, 4211400007U, 3548055156U, 2177921340U, 1213719510U, 3949138174U, 1708054717U,
            506471744U, 4033266604U, 1003413201U, 676517949U, 246364264U, 2981521535U, 2342452248U, 1577589793U,
            883666081U
        )

        val result = BigInteger32Arithmetic.multiply(a, b)
        assertTrue { BigInteger32Arithmetic.compare(c, result) == 0 }
    }

    @Test
    fun testToomCook3() {
        assertTrue {
            val a = uintArrayOf(0U, 0U, 1U)
            val b = uintArrayOf(0U, 0U, 1U)
            val result = BigInteger32Arithmetic.toomCook3Multiply(a, b)
            val basecaseMultiply = BigInteger32Arithmetic.debugNoKaratsuba(a, b)
            result.contentEquals(basecaseMultiply)
        }

        assertTrue {
            val a = uintArrayOf((0U - 1U) shr 1, (0U - 1U) shr 1, (0U - 1U) shr 1)
            val b = uintArrayOf((0U - 1U) shr 1, (0U - 1U) shr 1, (0U - 1U) shr 1)
            val result = BigInteger32Arithmetic.toomCook3Multiply(a, b)
            val basecaseMultiply = BigInteger32Arithmetic.debugNoKaratsuba(a, b)
            // println(BigInteger32Arithmetic.toString(result, 10))
            // println(BigInteger32Arithmetic.toString(basecaseMultiply, 10))
            result.contentEquals(basecaseMultiply)
        }

        assertTrue {
            val a = uintArrayOf(1U, 1U, 1U)
            val b = uintArrayOf(1U, 0U, 0U)
            val result = BigInteger32Arithmetic.toomCook3Multiply(a, b)
            val basecaseMultiply = BigInteger32Arithmetic.debugNoKaratsuba(a, b)
            result.contentEquals(BigInteger32Arithmetic.removeLeadingZeros(basecaseMultiply))
        }

        assertTrue {
            val a = uintArrayOf(1U, 2U, 3U, 4U, 5U, 6U)
            val b = uintArrayOf(1U, 2U, 3U, 4U, 5U, 6U)
            val result = BigInteger32Arithmetic.toomCook3Multiply(a, b)
            val basecaseMultiply = BigInteger32Arithmetic.debugNoKaratsuba(a, b)
            result.contentEquals(basecaseMultiply)
        }

        assertTrue {
            val a = uintArrayOf(0U, 0U, 0U, 1U)
            val b = uintArrayOf(0U, 0U, 0U, 1U)
            val result = BigInteger32Arithmetic.toomCook3Multiply(a, b)
            val basecaseMultiply = BigInteger32Arithmetic.multiply(a, b)
            result.contentEquals(basecaseMultiply)
        }

        assertTrue {
            val a = uintArrayOf(100U, 200U, 300U, 50U)
            val b = uintArrayOf(301U, 201U, 101U, 40U)
            val result = BigInteger32Arithmetic.toomCook3Multiply(a, b)
            val basecaseMultiply = BigInteger32Arithmetic.debugNoKaratsuba(a, b)
            result.contentEquals(basecaseMultiply)
        }
    }

    @Test
    fun testKaratsubaSimple() {
        assertTrue {
            val a = uintArrayOf(100U, 200U, 300U, 50U)
            val b = uintArrayOf(301U, 201U, 101U, 40U)
            val result = BigInteger32Arithmetic.karatsubaMultiply(a, b)
            val basecaseMultiply = BigInteger32Arithmetic.debugNoKaratsuba(a, b)
            result.contentEquals(basecaseMultiply)
        }
    }
}