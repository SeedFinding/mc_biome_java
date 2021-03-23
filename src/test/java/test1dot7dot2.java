import kaptainwutax.biomeutils.source.OverworldBiomeSource;
import kaptainwutax.seedutils.mc.MCVersion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test1dot7dot2 {
    // gen 17
    public int[][] base = {{171, 497, 0}, {69, 130, 2}, {412, 107, 2}, {35, 168, 3}, {233, 337, 3}, {510, 409, 24}, {92, 263, 2}, {223, 262, 2}, {201, 226, 3}, {54, 44, 0}, {221, 439, 3}, {234, 47, 3}, {392, 313, 24}, {506, 263, 3}, {53, 351, 2}, {269, 216, 3}, {71, 494, 2}, {44, 291, 24}, {451, 285, 1}, {457, 131, 3}, {241, 52, 24}, {326, 300, 4}, {163, 334, 2}, {86, 284, 0}, {407, 218, 3}, {121, 398, 0}, {158, 273, 3}, {213, 81, 2}, {76, 431, 24}, {76, 220, 3843}, {164, 252, 3}, {342, 426, 0}, {342, 307, 2}, {446, 426, 0}, {411, 428, 0}, {379, 436, 1}, {488, 116, 3}, {278, 201, 2}, {157, 355, 2}, {199, 377, 0}, {30, 37, 3}, {15, 325, 0}, {295, 498, 0}, {332, 477, 2}, {493, 256, 0}, {203, 121, 1}, {158, 272, 3}, {93, 150, 2}, {479, 229, 0}, {287, 9, 3}, {151, 297, 2}, {50, 491, 3}, {3, 308, 24}, {304, 461, 0}, {202, 470, 1}, {234, 397, 2}, {334, 115, 2}, {15, 47, 2}, {91, 311, 1}, {92, 420, 3}, {460, 120, 24}, {14, 232, 0}, {44, 164, 1}, {309, 315, 2}, {121, 503, 0}, {505, 430, 0}, {324, 345, 3}, {135, 320, 24}, {109, 444, 24}, {204, 202, 0}, {267, 278, 24}, {401, 125, 2}, {507, 369, 515}, {214, 120, 2}, {297, 274, 0}, {499, 504, 2}, {504, 373, 3}, {286, 364, 1}, {0, 229, 2}, {149, 429, 2}, {232, 272, 0}, {209, 207, 2}, {382, 458, 3}, {429, 395, 3}, {506, 500, 3}, {41, 188, 0}, {472, 477, 0}, {9, 95, 0}, {501, 483, 4}, {168, 336, 2051}, {270, 480, 0}, {369, 365, 0}, {253, 318, 2}, {486, 53, 3}, {151, 372, 3}, {364, 75, 3842}, {232, 293, 3}, {48, 186, 24}, {134, 177, 0}, {220, 208, 1}, {329, 462, 0}, {303, 384, 0}, {145, 426, 3}, {32, 225, 2}, {468, 505, 0}, {152, 20, 3}, {501, 344, 0}, {37, 314, 2}, {421, 73, 770}, {321, 218, 4}, {251, 335, 0}, {417, 366, 4}, {58, 447, 2}, {139, 41, 2}, {494, 160, 2}, {30, 471, 1}, {363, 172, 2050}, {24, 149, 2}, {489, 84, 1}, {219, 76, 1025}, {130, 469, 3}, {187, 10, 3}, {372, 258, 1}, {431, 64, 3}, {441, 496, 1}, {381, 408, 3}, {23, 329, 0}, {507, 6, 0}, {237, 511, 1}, {1, 148, 0}, {93, 8, 0}, {395, 482, 0}, {509, 426, 24}, {283, 273, 2}, {364, 424, 3}, {210, 493, 1}, {380, 316, 2}, {161, 401, 2}, {88, 264, 3}, {340, 437, 0}, {185, 416, 24}, {121, 77, 3}, {426, 276, 0}, {49, 10, 2}, {216, 327, 0}, {212, 394, 2}, {306, 399, 3}, {493, 133, 4}, {442, 485, 2}, {48, 486, 3}, {286, 34, 2}, {313, 220, 4}, {206, 386, 3}, {289, 472, 24}, {411, 87, 0}, {308, 103, 3}, {400, 111, 2}, {65, 57, 1}, {470, 480, 3}, {40, 473, 2}, {344, 155, 1}, {443, 263, 0}, {510, 62, 24}, {466, 161, 4}, {146, 433, 2}, {465, 351, 0}, {49, 428, 3}, {140, 40, 3}, {462, 159, 4}, {100, 29, 24}, {423, 269, 24}, {113, 429, 3}, {62, 52, 3}, {316, 386, 24}, {66, 391, 3}, {346, 371, 0}, {63, 442, 1}, {247, 467, 3}, {215, 121, 2}, {511, 387, 4}, {46, 446, 0}, {459, 230, 2}, {478, 379, 0}, {497, 356, 3}, {388, 128, 3}, {323, 352, 0}, {247, 64, 1}, {316, 242, 1}, {130, 251, 0}, {226, 370, 2}, {476, 332, 0}, {358, 151, 2}, {262, 218, 3}, {303, 214, 1}, {139, 201, 2}, {87, 285, 3}, {502, 306, 1}, {281, 7, 2}, {332, 501, 2}, {56, 152, 2563}, {475, 386, 24}, {234, 425, 0}, {279, 21, 2}, {456, 231, 2}, {122, 3, 3}, {503, 131, 4}, {52, 307, 2}, {198, 196, 0}, {302, 38, 0}, {284, 126, 3}, {418, 386, 24}, {39, 109, 4}, {400, 438, 4}, {456, 438, 1}, {412, 430, 24}, {399, 143, 0}, {132, 289, 0}, {456, 449, 24}, {243, 292, 0}, {309, 338, 3}, {61, 282, 3}, {341, 292, 2}, {366, 225, 24}, {186, 27, 3}, {233, 482, 3}, {250, 287, 0}, {326, 45, 0}, {220, 251, 3}, {213, 113, 0}, {482, 220, 0}, {261, 116, 3}, {214, 141, 2}, {146, 477, 1}, {198, 118, 1}, {397, 54, 3}, {338, 130, 1}, {368, 374, 0}, {67, 67, 1}, {466, 274, 0}, {338, 34, 1}, {240, 71, 2}, {203, 334, 4}, {254, 465, 4}, {35, 128, 0}, {70, 246, 3}, {107, 284, 24}, {20, 370, 2}, {421, 97, 0}, {469, 331, 0}, {455, 96, 3}, {2, 335, 0}, {88, 360, 2}, {468, 255, 0}, {332, 154, 2}, {499, 166, 3}, {164, 365, 3},};
    // gen 21
    public int[][] biomes = {{171, 497, 27},{69, 130, 5},{412, 107, 24},{35, 168, 6},{233, 337, 24},{510, 409, 5},{92, 263, 2},{223, 262, 27},{201, 226, 6},{54, 44, 0},{221, 439, 4},{234, 47, 2},{392, 313, 4},{506, 263, 12},{53, 351, 0},{269, 216, 0},{71, 494, 4},{44, 291, 29},{451, 285, 0},{457, 131, 21},{241, 52, 2},{326, 300, 5},{163, 334, 0},{86, 284, 24},{407, 218, 0},{121, 398, 0},{158, 273, 0},{213, 81, 0},{76, 431, 0},{76, 220, 29},{164, 252, 6},{342, 426, 21},{342, 307, 1},{446, 426, 1},{411, 428, 12},{379, 436, 4},{488, 116, 0},{278, 201, 0},{157, 355, 0},{199, 377, 0},{30, 37, 24},{15, 325, 30},{295, 498, 0},{332, 477, 5},{493, 256, 24},{203, 121, 3},{158, 272, 0},{93, 150, 4},{479, 229, 29},{287, 9, 1},{151, 297, 29},{50, 491, 1},{3, 308, 35},{304, 461, 4},{202, 470, 24},{234, 397, 3},{334, 115, 4},{15, 47, 6},{91, 311, 1},{92, 420, 24},{460, 120, 3},{14, 232, 2},{44, 164, 0},{309, 315, 27},{121, 503, 35},{505, 430, 1},{324, 345, 24},{135, 320, 5},{109, 444, 32},{204, 202, 3},{267, 278, 2},{401, 125, 24},{507, 369, 0},{214, 120, 6},{297, 274, 0},{499, 504, 1},{504, 373, 0},{286, 364, 0},{0, 229, 35},{149, 429, 12},{232, 272, 4},{209, 207, 4},{382, 458, 5},{429, 395, 24},{506, 500, 6},{41, 188, 6},{472, 477, 4},{9, 95, 27},{501, 483, 1},{168, 336, 0},{270, 480, 4},{369, 365, 0},{253, 318, 12},{486, 53, 27},{151, 372, 0},{364, 75, 5},{232, 293, 29},{48, 186, 27},{134, 177, 35},{220, 208, 6},{329, 462, 0},{303, 384, 3},{145, 426, 30},{32, 225, 2},{468, 505, 0},{152, 20, 0},{501, 344, 0},{37, 314, 0},{421, 73, 24},{321, 218, 1},{251, 335, 0},{417, 366, 0},{58, 447, 0},{139, 41, 29},{494, 160, 3},{30, 471, 4},{363, 172, 2},{24, 149, 0},{489, 84, 4},{219, 76, 35},{130, 469, 1},{187, 10, 2},{372, 258, 3},{431, 64, 24},{441, 496, 0},{381, 408, 4},{23, 329, 12},{507, 6, 0},{237, 511, 0},{1, 148, 4},{93, 8, 3},{395, 482, 35},{509, 426, 3},{283, 273, 0},{364, 424, 4},{210, 493, 12},{380, 316, 27},{161, 401, 12},{88, 264, 2},{340, 437, 21},{185, 416, 12},{121, 77, 4},{426, 276, 0},{49, 10, 0},{216, 327, 24},{212, 394, 4},{306, 399, 3},{493, 133, 4},{442, 485, 3},{48, 486, 1},{286, 34, 24},{313, 220, 29},{206, 386, 24},{289, 472, 4},{411, 87, 0},{308, 103, 21},{400, 111, 0},{65, 57, 0},{470, 480, 0},{40, 473, 27},{344, 155, 2},{443, 263, 2},{510, 62, 2},{466, 161, 0},{146, 433, 30},{465, 351, 24},{49, 428, 1},{140, 40, 29},{462, 159, 0},{100, 29, 12},{423, 269, 24},{113, 429, 5},{62, 52, 0},{316, 386, 24},{66, 391, 0},{346, 371, 29},{63, 442, 2},{247, 467, 5},{215, 121, 6},{511, 387, 4},{46, 446, 4},{459, 230, 29},{478, 379, 2},{497, 356, 0},{388, 128, 24},{323, 352, 5},{247, 64, 35},{316, 242, 1},{130, 251, 2},{226, 370, 2},{476, 332, 0},{358, 151, 0},{262, 218, 24},{303, 214, 12},{139, 201, 4},{87, 285, 0},{502, 306, 29},{281, 7, 0},{332, 501, 3},{56, 152, 0},{475, 386, 0},{234, 425, 0},{279, 21, 0},{456, 231, 5},{122, 3, 0},{503, 131, 5},{52, 307, 0},{198, 196, 12},{302, 38, 4},{284, 126, 29},{418, 386, 24},{39, 109, 3},{400, 438, 12},{456, 438, 5},{412, 430, 12},{399, 143, 2},{132, 289, 5},{456, 449, 6},{243, 292, 6},{309, 338, 0},{61, 282, 35},{341, 292, 1},{366, 225, 0},{186, 27, 2},{233, 482, 0},{250, 287, 1},{326, 45, 12},{220, 251, 4},{213, 113, 2},{482, 220, 4},{261, 116, 3},{214, 141, 6},{146, 477, 2},{198, 118, 1},{397, 54, 2},{338, 130, 0},{368, 374, 0},{67, 67, 0},{466, 274, 0},{338, 34, 12},{240, 71, 0},{203, 334, 0},{254, 465, 32},{35, 128, 6},{70, 246, 35},{107, 284, 6},{20, 370, 21},{421, 97, 24},{469, 331, 5},{455, 96, 30},{2, 335, 0},{88, 360, 35},{468, 255, 5},{332, 154, 24},{499, 166, 27},{164, 365, 0},};
    // gen 22
    public int[][] noise = {{171, 497, 298178},{69, 130, 136333},{412, 107, 124047},{35, 168, 234012},{233, 337, 251387},{510, 409, 191910},{92, 263, 148128},{223, 262, 55020},{201, 226, 160120},{54, 44, 0},{221, 439, 90143},{234, 47, 12305},{392, 313, 217928},{506, 263, 121741},{53, 351, 0},{269, 216, 279277},{71, 494, 5233},{44, 291, 47793},{451, 285, 0},{457, 131, 3801},{241, 52, 60134},{326, 300, 187358},{163, 334, 0},{86, 284, 37903},{407, 218, 0},{121, 398, 0},{158, 273, 0},{213, 81, 0},{76, 431, 0},{76, 220, 7852},{164, 252, 120598},{342, 426, 200968},{342, 307, 49227},{446, 426, 10251},{411, 428, 77004},{379, 436, 179150},{488, 116, 0},{278, 201, 0},{157, 355, 223231},{199, 377, 0},{30, 37, 0},{15, 325, 37773},{295, 498, 0},{332, 477, 98497},{493, 256, 0},{203, 121, 227113},{158, 272, 0},{93, 150, 3111},{479, 229, 195891},{287, 9, 21836},{151, 297, 231280},{50, 491, 142613},{3, 308, 86326},{304, 461, 128481},{202, 470, 140880},{234, 397, 0},{334, 115, 0},{15, 47, 193988},{91, 311, 116085},{92, 420, 183539},{460, 120, 270522},{14, 232, 270253},{44, 164, 0},{309, 315, 13821},{121, 503, 98977},{505, 430, 62931},{324, 345, 175152},{135, 320, 241352},{109, 444, 297705},{204, 202, 230271},{267, 278, 44813},{401, 125, 133442},{507, 369, 0},{214, 120, 158777},{297, 274, 0},{499, 504, 9568},{504, 373, 285190},{286, 364, 264457},{0, 229, 1723},{149, 429, 70079},{232, 272, 1764},{209, 207, 23504},{382, 458, 0},{429, 395, 243948},{506, 500, 74389},{41, 188, 91627},{472, 477, 14084},{9, 95, 99762},{501, 483, 249174},{168, 336, 0},{270, 480, 169016},{369, 365, 219667},{253, 318, 236952},{486, 53, 137576},{151, 372, 0},{364, 75, 274418},{232, 293, 36527},{48, 186, 0},{134, 177, 154534},{220, 208, 14622},{329, 462, 128320},{303, 384, 2912},{145, 426, 232329},{32, 225, 193378},{468, 505, 0},{152, 20, 0},{501, 344, 0},{37, 314, 0},{421, 73, 105714},{321, 218, 117272},{251, 335, 0},{417, 366, 0},{58, 447, 0},{139, 41, 299075},{494, 160, 38268},{30, 471, 289944},{363, 172, 272693},{24, 149, 240546},{489, 84, 246715},{219, 76, 158122},{130, 469, 162319},{187, 10, 217721},{372, 258, 212563},{431, 64, 200294},{441, 496, 0},{381, 408, 141133},{23, 329, 0},{507, 6, 0},{237, 511, 126367},{1, 148, 146625},{93, 8, 236583},{395, 482, 137971},{509, 426, 141556},{283, 273, 0},{364, 424, 179324},{210, 493, 148812},{380, 316, 210094},{161, 401, 14909},{88, 264, 14056},{340, 437, 48014},{185, 416, 35829},{121, 77, 104959},{426, 276, 0},{49, 10, 0},{216, 327, 2375},{212, 394, 126513},{306, 399, 111091},{493, 133, 203047},{442, 485, 57839},{48, 486, 290512},{286, 34, 0},{313, 220, 151035},{206, 386, 0},{289, 472, 278205},{411, 87, 0},{308, 103, 142413},{400, 111, 22730},{65, 57, 0},{470, 480, 0},{40, 473, 30783},{344, 155, 69973},{443, 263, 64317},{510, 62, 8652},{466, 161, 0},{146, 433, 277791},{465, 351, 110330},{49, 428, 105481},{140, 40, 299075},{462, 159, 0},{100, 29, 278292},{423, 269, 145901},{113, 429, 184060},{62, 52, 0},{316, 386, 148352},{66, 391, 0},{346, 371, 92974},{63, 442, 208611},{247, 467, 0},{215, 121, 158777},{511, 387, 40549},{46, 446, 0},{459, 230, 51674},{478, 379, 0},{497, 356, 0},{388, 128, 244831},{323, 352, 118644},{247, 64, 4485},{316, 242, 147799},{130, 251, 151243},{226, 370, 39962},{476, 332, 0},{358, 151, 0},{262, 218, 6626},{303, 214, 262307},{139, 201, 273407},{87, 285, 0},{502, 306, 137326},{281, 7, 0},{332, 501, 108884},{56, 152, 0},{475, 386, 273218},{234, 425, 0},{279, 21, 0},{456, 231, 176979},{122, 3, 91612},{503, 131, 104242},{52, 307, 10005},{198, 196, 85801},{302, 38, 56753},{284, 126, 137424},{418, 386, 164715},{39, 109, 20449},{400, 438, 106171},{456, 438, 32931},{412, 430, 246234},{399, 143, 28433},{132, 289, 101841},{456, 449, 72393},{243, 292, 108137},{309, 338, 0},{61, 282, 266774},{341, 292, 129991},{366, 225, 0},{186, 27, 93091},{233, 482, 0},{250, 287, 145378},{326, 45, 242252},{220, 251, 134133},{213, 113, 233723},{482, 220, 197790},{261, 116, 277509},{214, 141, 188060},{146, 477, 144093},{198, 118, 80017},{397, 54, 19061},{338, 130, 0},{368, 374, 231616},{67, 67, 0},{466, 274, 0},{338, 34, 186844},{240, 71, 0},{203, 334, 0},{254, 465, 67001},{35, 128, 269149},{70, 246, 49232},{107, 284, 58652},{20, 370, 0},{421, 97, 81246},{469, 331, 207855},{455, 96, 104719},{2, 335, 578},{88, 360, 285389},{468, 255, 61276},{332, 154, 0},{499, 166, 219299},{164, 365, 293135},};
    // gen 33
    public int[][] variants = {{171, 497, 3},{69, 130, 5},{412, 107, 0},{35, 168, 5},{233, 337, 0},{510, 409, 24},{92, 263, 5},{223, 262, 0},{201, 226, 4},{54, 44, 5},{221, 439, 3},{234, 47, 24},{392, 313, 4},{506, 263, 1},{53, 351, 1},{269, 216, 24},{71, 494, 3},{44, 291, 3},{451, 285, 0},{457, 131, 3},{241, 52, 24},{326, 300, 0},{163, 334, 0},{86, 284, 1},{407, 218, 5},{121, 398, 4},{158, 273, 4},{213, 81, 24},{76, 431, 5},{76, 220, 1},{164, 252, 4},{342, 426, 1},{342, 307, 16},{446, 426, 24},{411, 428, 0},{379, 436, 5},{488, 116, 5},{278, 201, 0},{157, 355, 0},{199, 377, 24},{30, 37, 34},{15, 325, 4},{295, 498, 4},{332, 477, 4},{493, 256, 5},{203, 121, 24},{158, 272, 4},{93, 150, 0},{479, 229, 3},{287, 9, 24},{151, 297, 1},{50, 491, 3},{3, 308, 4},{304, 461, 1},{202, 470, 3},{234, 397, 0},{334, 115, 24},{15, 47, 1},{91, 311, 18},{92, 420, 4},{460, 120, 131},{14, 232, 19},{44, 164, 5},{309, 315, 16},{121, 503, 34},{505, 430, 24},{324, 345, 0},{135, 320, 1},{109, 444, 5},{204, 202, 24},{267, 278, 4},{401, 125, 0},{507, 369, 4},{214, 120, 24},{297, 274, 0},{499, 504, 24},{504, 373, 0},{286, 364, 1},{0, 229, 4},{149, 429, 18},{232, 272, 0},{209, 207, 24},{382, 458, 5},{429, 395, 0},{506, 500, 24},{41, 188, 18},{472, 477, 24},{9, 95, 133},{501, 483, 24},{168, 336, 24},{270, 480, 4},{369, 365, 0},{253, 318, 4},{486, 53, 0},{151, 372, 0},{364, 75, 24},{232, 293, 0},{48, 186, 18},{134, 177, 24},{220, 208, 24},{329, 462, 1},{303, 384, 1},{145, 426, 18},{32, 225, 5},{468, 505, 24},{152, 20, 24},{501, 344, 4},{37, 314, 1},{421, 73, 0},{321, 218, 24},{251, 335, 4},{417, 366, 0},{58, 447, 19},{139, 41, 24},{494, 160, 131},{30, 471, 5},{363, 172, 24},{24, 149, 5},{489, 84, 1},{219, 76, 24},{130, 469, 4},{187, 10, 24},{372, 258, 0},{431, 64, 0},{441, 496, 24},{381, 408, 0},{23, 329, 1},{507, 6, 24},{237, 511, 4},{1, 148, 133},{93, 8, 16},{395, 482, 0},{509, 426, 24},{283, 273, 16},{364, 424, 1},{210, 493, 18},{380, 316, 4},{161, 401, 0},{88, 264, 5},{340, 437, 5},{185, 416, 0},{121, 77, 24},{426, 276, 5},{49, 10, 5},{216, 327, 0},{212, 394, 16},{306, 399, 4},{493, 133, 5},{442, 485, 24},{48, 486, 34},{286, 34, 24},{313, 220, 24},{206, 386, 24},{289, 472, 4},{411, 87, 24},{308, 103, 24},{400, 111, 0},{65, 57, 0},{470, 480, 24},{40, 473, 3},{344, 155, 24},{443, 263, 19},{510, 62, 1},{466, 161, 3},{146, 433, 18},{465, 351, 25},{49, 428, 5},{140, 40, 24},{462, 159, 3},{100, 29, 24},{423, 269, 5},{113, 429, 4},{62, 52, 3},{316, 386, 1},{66, 391, 4},{346, 371, 0},{63, 442, 19},{247, 467, 4},{215, 121, 24},{511, 387, 0},{46, 446, 19},{459, 230, 5},{478, 379, 0},{497, 356, 4},{388, 128, 0},{323, 352, 16},{247, 64, 24},{316, 242, 0},{130, 251, 1},{226, 370, 16},{476, 332, 0},{358, 151, 24},{262, 218, 24},{303, 214, 24},{139, 201, 0},{87, 285, 1},{502, 306, 1},{281, 7, 24},{332, 501, 4},{56, 152, 5},{475, 386, 34},{234, 425, 4},{279, 21, 24},{456, 231, 5},{122, 3, 24},{503, 131, 5},{52, 307, 3},{198, 196, 24},{302, 38, 24},{284, 126, 24},{418, 386, 24},{39, 109, 133},{400, 438, 19},{456, 438, 24},{412, 430, 0},{399, 143, 24},{132, 289, 4},{456, 449, 24},{243, 292, 4},{309, 338, 0},{61, 282, 5},{341, 292, 0},{366, 225, 0},{186, 27, 24},{233, 482, 4},{250, 287, 4},{326, 45, 24},{220, 251, 16},{213, 113, 24},{482, 220, 34},{261, 116, 24},{214, 141, 24},{146, 477, 4},{198, 118, 24},{397, 54, 24},{338, 130, 0},{368, 374, 0},{67, 67, 25},{466, 274, 19},{338, 34, 24},{240, 71, 24},{203, 334, 24},{254, 465, 4},{35, 128, 5},{70, 246, 5},{107, 284, 1},{20, 370, 1},{421, 97, 24},{469, 331, 0},{455, 96, 3},{2, 335, 1},{88, 360, 4},{468, 255, 5},{332, 154, 0},{499, 166, 131},{164, 365, 0},};
    // gen 41
    public int[][] river = {{171, 497, -1},{69, 130, -1},{412, 107, -1},{35, 168, -1},{233, 337, -1},{510, 409, -1},{92, 263, -1},{223, 262, -1},{201, 226, -1},{54, 44, 7},{221, 439, -1},{234, 47, 7},{392, 313, -1},{506, 263, -1},{53, 351, -1},{269, 216, 7},{71, 494, 7},{44, 291, -1},{451, 285, -1},{457, 131, 7},{241, 52, -1},{326, 300, -1},{163, 334, -1},{86, 284, -1},{407, 218, -1},{121, 398, 7},{158, 273, -1},{213, 81, -1},{76, 431, -1},{76, 220, -1},{164, 252, -1},{342, 426, -1},{342, 307, -1},{446, 426, -1},{411, 428, -1},{379, 436, -1},{488, 116, -1},{278, 201, -1},{157, 355, -1},{199, 377, -1},{30, 37, -1},{15, 325, -1},{295, 498, -1},{332, 477, -1},{493, 256, -1},{203, 121, -1},{158, 272, -1},{93, 150, -1},{479, 229, -1},{287, 9, -1},{151, 297, -1},{50, 491, -1},{3, 308, -1},{304, 461, -1},{202, 470, -1},{234, 397, -1},{334, 115, -1},{15, 47, -1},{91, 311, 7},{92, 420, -1},{460, 120, -1},{14, 232, -1},{44, 164, -1},{309, 315, 7},{121, 503, -1},{505, 430, -1},{324, 345, -1},{135, 320, -1},{109, 444, -1},{204, 202, -1},{267, 278, -1},{401, 125, -1},{507, 369, -1},{214, 120, -1},{297, 274, -1},{499, 504, -1},{504, 373, -1},{286, 364, -1},{0, 229, -1},{149, 429, -1},{232, 272, -1},{209, 207, -1},{382, 458, 7},{429, 395, -1},{506, 500, -1},{41, 188, -1},{472, 477, -1},{9, 95, -1},{501, 483, -1},{168, 336, -1},{270, 480, -1},{369, 365, -1},{253, 318, -1},{486, 53, -1},{151, 372, -1},{364, 75, -1},{232, 293, -1},{48, 186, -1},{134, 177, -1},{220, 208, -1},{329, 462, -1},{303, 384, -1},{145, 426, -1},{32, 225, -1},{468, 505, -1},{152, 20, 7},{501, 344, -1},{37, 314, -1},{421, 73, -1},{321, 218, -1},{251, 335, -1},{417, 366, -1},{58, 447, -1},{139, 41, -1},{494, 160, -1},{30, 471, -1},{363, 172, -1},{24, 149, -1},{489, 84, -1},{219, 76, -1},{130, 469, -1},{187, 10, -1},{372, 258, -1},{431, 64, -1},{441, 496, 7},{381, 408, -1},{23, 329, -1},{507, 6, -1},{237, 511, -1},{1, 148, -1},{93, 8, 7},{395, 482, -1},{509, 426, -1},{283, 273, -1},{364, 424, -1},{210, 493, -1},{380, 316, -1},{161, 401, -1},{88, 264, -1},{340, 437, -1},{185, 416, -1},{121, 77, -1},{426, 276, -1},{49, 10, -1},{216, 327, -1},{212, 394, -1},{306, 399, -1},{493, 133, -1},{442, 485, -1},{48, 486, -1},{286, 34, -1},{313, 220, -1},{206, 386, -1},{289, 472, -1},{411, 87, -1},{308, 103, -1},{400, 111, -1},{65, 57, 7},{470, 480, -1},{40, 473, -1},{344, 155, -1},{443, 263, -1},{510, 62, -1},{466, 161, -1},{146, 433, -1},{465, 351, -1},{49, 428, -1},{140, 40, -1},{462, 159, -1},{100, 29, -1},{423, 269, -1},{113, 429, -1},{62, 52, -1},{316, 386, -1},{66, 391, -1},{346, 371, -1},{63, 442, -1},{247, 467, -1},{215, 121, -1},{511, 387, -1},{46, 446, -1},{459, 230, -1},{478, 379, -1},{497, 356, -1},{388, 128, -1},{323, 352, -1},{247, 64, -1},{316, 242, -1},{130, 251, -1},{226, 370, -1},{476, 332, -1},{358, 151, -1},{262, 218, -1},{303, 214, -1},{139, 201, -1},{87, 285, -1},{502, 306, -1},{281, 7, -1},{332, 501, -1},{56, 152, -1},{475, 386, -1},{234, 425, -1},{279, 21, 7},{456, 231, -1},{122, 3, -1},{503, 131, -1},{52, 307, -1},{198, 196, -1},{302, 38, -1},{284, 126, -1},{418, 386, 7},{39, 109, -1},{400, 438, -1},{456, 438, -1},{412, 430, -1},{399, 143, -1},{132, 289, -1},{456, 449, -1},{243, 292, -1},{309, 338, -1},{61, 282, -1},{341, 292, -1},{366, 225, -1},{186, 27, -1},{233, 482, -1},{250, 287, -1},{326, 45, -1},{220, 251, -1},{213, 113, -1},{482, 220, -1},{261, 116, 7},{214, 141, -1},{146, 477, -1},{198, 118, -1},{397, 54, -1},{338, 130, -1},{368, 374, -1},{67, 67, -1},{466, 274, -1},{338, 34, -1},{240, 71, -1},{203, 334, -1},{254, 465, -1},{35, 128, -1},{70, 246, -1},{107, 284, 7},{20, 370, -1},{421, 97, -1},{469, 331, -1},{455, 96, -1},{2, 335, -1},{88, 360, -1},{468, 255, -1},{332, 154, -1},{499, 166, -1},{164, 365, -1},};
    // gen 42
    public int[][] full = {{171, 497, 3}, {69, 130, 5}, {412, 107, 0}, {35, 168, 5}, {233, 337, 0}, {510, 409, 24}, {92, 263, 5}, {223, 262, 0}, {201, 226, 4}, {54, 44, 7}, {221, 439, 3}, {234, 47, 24}, {392, 313, 4}, {506, 263, 1}, {53, 351, 1}, {269, 216, 24}, {71, 494, 7}, {44, 291, 3}, {451, 285, 0}, {457, 131, 7}, {241, 52, 24}, {326, 300, 0}, {163, 334, 0}, {86, 284, 1}, {407, 218, 5}, {121, 398, 7}, {158, 273, 4}, {213, 81, 24}, {76, 431, 5}, {76, 220, 1}, {164, 252, 4}, {342, 426, 1}, {342, 307, 16}, {446, 426, 24}, {411, 428, 0}, {379, 436, 5}, {488, 116, 5}, {278, 201, 0}, {157, 355, 0}, {199, 377, 24}, {30, 37, 34}, {15, 325, 4}, {295, 498, 4}, {332, 477, 4}, {493, 256, 5}, {203, 121, 24}, {158, 272, 4}, {93, 150, 0}, {479, 229, 3}, {287, 9, 24}, {151, 297, 1}, {50, 491, 3}, {3, 308, 4}, {304, 461, 1}, {202, 470, 3}, {234, 397, 0}, {334, 115, 24}, {15, 47, 1}, {91, 311, 7}, {92, 420, 4}, {460, 120, 131}, {14, 232, 19}, {44, 164, 5}, {309, 315, 7}, {121, 503, 34}, {505, 430, 24}, {324, 345, 0}, {135, 320, 1}, {109, 444, 5}, {204, 202, 24}, {267, 278, 4}, {401, 125, 0}, {507, 369, 4}, {214, 120, 24}, {297, 274, 0}, {499, 504, 24}, {504, 373, 0}, {286, 364, 1}, {0, 229, 4}, {149, 429, 18}, {232, 272, 0}, {209, 207, 24}, {382, 458, 7}, {429, 395, 0}, {506, 500, 24}, {41, 188, 18}, {472, 477, 24}, {9, 95, 133}, {501, 483, 24}, {168, 336, 24}, {270, 480, 4}, {369, 365, 0}, {253, 318, 4}, {486, 53, 0}, {151, 372, 0}, {364, 75, 24}, {232, 293, 0}, {48, 186, 18}, {134, 177, 24}, {220, 208, 24}, {329, 462, 1}, {303, 384, 1}, {145, 426, 18}, {32, 225, 5}, {468, 505, 24}, {152, 20, 24}, {501, 344, 4}, {37, 314, 1}, {421, 73, 0}, {321, 218, 24}, {251, 335, 4}, {417, 366, 0}, {58, 447, 19}, {139, 41, 24}, {494, 160, 131}, {30, 471, 5}, {363, 172, 24}, {24, 149, 5}, {489, 84, 1}, {219, 76, 24}, {130, 469, 4}, {187, 10, 24}, {372, 258, 0}, {431, 64, 0}, {441, 496, 24}, {381, 408, 0}, {23, 329, 1}, {507, 6, 24}, {237, 511, 4}, {1, 148, 133}, {93, 8, 7}, {395, 482, 0}, {509, 426, 24}, {283, 273, 16}, {364, 424, 1}, {210, 493, 18}, {380, 316, 4}, {161, 401, 0}, {88, 264, 5}, {340, 437, 5}, {185, 416, 0}, {121, 77, 24}, {426, 276, 5}, {49, 10, 5}, {216, 327, 0}, {212, 394, 16}, {306, 399, 4}, {493, 133, 5}, {442, 485, 24}, {48, 486, 34}, {286, 34, 24}, {313, 220, 24}, {206, 386, 24}, {289, 472, 4}, {411, 87, 24}, {308, 103, 24}, {400, 111, 0}, {65, 57, 0}, {470, 480, 24}, {40, 473, 3}, {344, 155, 24}, {443, 263, 19}, {510, 62, 1}, {466, 161, 3}, {146, 433, 18}, {465, 351, 25}, {49, 428, 5}, {140, 40, 24}, {462, 159, 3}, {100, 29, 24}, {423, 269, 5}, {113, 429, 4}, {62, 52, 3}, {316, 386, 1}, {66, 391, 4}, {346, 371, 0}, {63, 442, 19}, {247, 467, 4}, {215, 121, 24}, {511, 387, 0}, {46, 446, 19}, {459, 230, 5}, {478, 379, 0}, {497, 356, 4}, {388, 128, 0}, {323, 352, 16}, {247, 64, 24}, {316, 242, 0}, {130, 251, 1}, {226, 370, 16}, {476, 332, 0}, {358, 151, 24}, {262, 218, 24}, {303, 214, 24}, {139, 201, 0}, {87, 285, 1}, {502, 306, 1}, {281, 7, 24}, {332, 501, 4}, {56, 152, 5}, {475, 386, 34}, {234, 425, 4}, {279, 21, 24}, {456, 231, 5}, {122, 3, 24}, {503, 131, 5}, {52, 307, 3}, {198, 196, 24}, {302, 38, 24}, {284, 126, 24}, {418, 386, 24}, {39, 109, 133}, {400, 438, 19}, {456, 438, 24}, {412, 430, 0}, {399, 143, 24}, {132, 289, 4}, {456, 449, 24}, {243, 292, 4}, {309, 338, 0}, {61, 282, 5}, {341, 292, 0}, {366, 225, 0}, {186, 27, 24}, {233, 482, 4}, {250, 287, 4}, {326, 45, 24}, {220, 251, 16}, {213, 113, 24}, {482, 220, 34}, {261, 116, 24}, {214, 141, 24}, {146, 477, 4}, {198, 118, 24}, {397, 54, 24}, {338, 130, 0}, {368, 374, 0}, {67, 67, 25}, {466, 274, 19}, {338, 34, 24}, {240, 71, 24}, {203, 334, 24}, {254, 465, 4}, {35, 128, 5}, {70, 246, 5}, {107, 284, 7}, {20, 370, 1}, {421, 97, 24}, {469, 331, 0}, {455, 96, 3}, {2, 335, 1}, {88, 360, 4}, {468, 255, 5}, {332, 154, 0}, {499, 166, 131}, {164, 365, 0},};
    // gen 43
    public int[][] voronoi = {{171, 497, 5}, {69, 130, 1}, {412, 107, 0}, {35, 168, 1}, {233, 337, 5}, {510, 409, 0}, {92, 263, 3}, {223, 262, 34}, {201, 226, 3}, {54, 44, 0}, {221, 439, 5}, {234, 47, 5}, {392, 313, 24}, {506, 263, 0}, {53, 351, 1}, {269, 216, 7}, {71, 494, 19}, {44, 291, 1}, {451, 285, 24}, {457, 131, 24}, {241, 52, 5}, {326, 300, 24}, {163, 334, 5}, {86, 284, 3}, {407, 218, 24}, {121, 398, 133}, {158, 273, 34}, {213, 81, 5}, {76, 431, 133}, {76, 220, 1}, {164, 252, 34}, {342, 426, 16}, {342, 307, 24}, {446, 426, 24}, {411, 428, 0}, {379, 436, 0}, {488, 116, 0}, {278, 201, 5}, {157, 355, 133}, {199, 377, 133}, {30, 37, 16}, {15, 325, 1}, {295, 498, 5}, {332, 477, 5}, {493, 256, 0}, {203, 121, 5}, {158, 272, 34}, {93, 150, 1}, {479, 229, 24}, {287, 9, 19}, {151, 297, 34}, {50, 491, 19}, {3, 308, 1}, {304, 461, 5}, {202, 470, 5}, {234, 397, 5}, {334, 115, 0}, {15, 47, 1}, {91, 311, 3}, {92, 420, 133}, {460, 120, 24}, {14, 232, 1}, {44, 164, 1}, {309, 315, 24}, {121, 503, 5}, {505, 430, 0}, {324, 345, 0}, {135, 320, 3}, {109, 444, 133}, {204, 202, 3}, {267, 278, 3}, {401, 125, 24}, {507, 369, 0}, {214, 120, 5}, {297, 274, 24}, {499, 504, 0}, {504, 373, 0}, {286, 364, 0}, {0, 229, 1}, {149, 429, 133}, {232, 272, 34}, {209, 207, 3}, {382, 458, 0}, {429, 395, 0}, {506, 500, 0}, {41, 188, 1}, {472, 477, 0}, {9, 95, 1}, {501, 483, 0}, {168, 336, 5}, {270, 480, 5}, {369, 365, 0}, {253, 318, 3}, {486, 53, 0}, {151, 372, 133}, {364, 75, 0}, {232, 293, 3}, {48, 186, 1}, {134, 177, 34}, {220, 208, 3}, {329, 462, 5}, {303, 384, 0}, {145, 426, 133}, {32, 225, 1}, {468, 505, 0}, {152, 20, 5}, {501, 344, 24}, {37, 314, 1}, {421, 73, 0}, {321, 218, 0}, {251, 335, 25}, {417, 366, 24}, {58, 447, 133}, {139, 41, 5}, {494, 160, 24}, {30, 471, 133}, {363, 172, 0}, {24, 149, 1}, {489, 84, 0}, {219, 76, 5}, {130, 469, 133}, {187, 10, 5}, {372, 258, 24}, {431, 64, 0}, {441, 496, 0}, {381, 408, 24}, {23, 329, 1}, {507, 6, 24}, {237, 511, 5}, {1, 148, 18}, {93, 8, 5}, {395, 482, 0}, {509, 426, 0}, {283, 273, 25}, {364, 424, 0}, {210, 493, 19}, {380, 316, 24}, {161, 401, 133}, {88, 264, 3}, {340, 437, 7}, {185, 416, 133}, {121, 77, 16}, {426, 276, 24}, {49, 10, 16}, {216, 327, 5}, {212, 394, 133}, {306, 399, 16}, {493, 133, 0}, {442, 485, 24}, {48, 486, 19}, {286, 34, 5}, {313, 220, 0}, {206, 386, 133}, {289, 472, 5}, {411, 87, 0}, {308, 103, 5}, {400, 111, 0}, {65, 57, 0}, {470, 480, 0}, {40, 473, 133}, {344, 155, 0}, {443, 263, 0}, {510, 62, 0}, {466, 161, 24}, {146, 433, 133}, {465, 351, 24}, {49, 428, 133}, {140, 40, 5}, {462, 159, 24}, {100, 29, 16}, {423, 269, 24}, {113, 429, 133}, {62, 52, 0}, {316, 386, 0}, {66, 391, 133}, {346, 371, 0}, {63, 442, 133}, {247, 467, 5}, {215, 121, 5}, {511, 387, 0}, {46, 446, 133}, {459, 230, 0}, {478, 379, 0}, {497, 356, 24}, {388, 128, 24}, {323, 352, 0}, {247, 64, 5}, {316, 242, 24}, {130, 251, 34}, {226, 370, 5}, {476, 332, 0}, {358, 151, 0}, {262, 218, 7}, {303, 214, 25}, {139, 201, 34}, {87, 285, 3}, {502, 306, 24}, {281, 7, 19}, {332, 501, 5}, {56, 152, 1}, {475, 386, 0}, {234, 425, 5}, {279, 21, 19}, {456, 231, 0}, {122, 3, 5}, {503, 131, 0}, {52, 307, 1}, {198, 196, 3}, {302, 38, 5}, {284, 126, 19}, {418, 386, 24}, {39, 109, 1}, {400, 438, 0}, {456, 438, 24}, {412, 430, 0}, {399, 143, 24}, {132, 289, 34}, {456, 449, 24}, {243, 292, 3}, {309, 338, 0}, {61, 282, 3}, {341, 292, 24}, {366, 225, 24}, {186, 27, 5}, {233, 482, 19}, {250, 287, 3}, {326, 45, 5}, {220, 251, 34}, {213, 113, 5}, {482, 220, 24}, {261, 116, 19}, {214, 141, 19}, {146, 477, 133}, {198, 118, 5}, {397, 54, 0}, {338, 130, 0}, {368, 374, 0}, {67, 67, 16}, {466, 274, 0}, {338, 34, 5}, {240, 71, 5}, {203, 334, 133}, {254, 465, 5}, {35, 128, 1}, {70, 246, 3}, {107, 284, 3}, {20, 370, 19}, {421, 97, 0}, {469, 331, 24}, {455, 96, 24}, {2, 335, 1}, {88, 360, 133}, {468, 255, 0}, {332, 154, 16}, {499, 166, 24}, {164, 365, 133},};
    private OverworldBiomeSource overworldBiomeSource;
    private int size;

    @BeforeEach
    public void setup() {
        this.overworldBiomeSource = new OverworldBiomeSource(MCVersion.v1_7_2, 489435348641386L);
        this.size = 16;
    }

    @Test
    @DisplayName("Test Biomes against data for 1.7.2")
    public void testBiomes() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int x = biomes[i * size + j][0];
                int z = biomes[i * size + j][1];
                int id = overworldBiomeSource.biomes.sample(x, 0, z);
                assertEquals(biomes[i * size + j][2], id, x + " " + z + " Wrong got id " + id + " but was " + biomes[i * size + j][2]);
            }
        }
    }

    @Test
    @DisplayName("Test Noise against data for 1.7.2")
    public void testNoise() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int x = noise[i * size + j][0];
                int z = noise[i * size + j][1];
                int id = overworldBiomeSource.noise.sample(x, 0, z);
                assertEquals(noise[i * size + j][2], id, x + " " + z + " Wrong got id " + id + " but was " + noise[i * size + j][2]);
            }
        }
    }

    @Test
    @DisplayName("Test full mixing river with biomes against data for 1.7.2")
    public void testFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int x = full[i * size + j][0];
                int z = full[i * size + j][1];
                int id = overworldBiomeSource.full.sample(x, 0, z);
                assertEquals(full[i * size + j][2], id, x + " " + z + " Wrong got id " + id + " but was " + full[i * size + j][2]);
            }
        }
    }

    @Test
    @DisplayName("Test voronoi against data for 1.7.2")
    public void testVoronoi() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int x = voronoi[i * size + j][0];
                int z = voronoi[i * size + j][1];
                int id = overworldBiomeSource.voronoi.sample(x, 0, z);
                assertEquals(voronoi[i * size + j][2], id, x + " " + z + " Wrong got id " + id + " but was " + voronoi[i * size + j][2]);
            }
        }
    }

    @Test
    @DisplayName("Test river against data for 1.7.2")
    public void testRiver() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int x = river[i * size + j][0];
                int z = river[i * size + j][1];
                int id = overworldBiomeSource.river.sample(x, 0, z);
                assertEquals(river[i * size + j][2], id, x + " " + z + " Wrong got id " + id + " but was " + river[i * size + j][2]);
            }
        }
    }

    @Test
    @DisplayName("Test Variants against data for 1.7.2")
    public void testVariants() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int x = variants[i * size + j][0];
                int z = variants[i * size + j][1];
                int id = overworldBiomeSource.variants.sample(x, 0, z);
                assertEquals(variants[i * size + j][2], id, x + " " + z + " Wrong got id " + id + " but was " + variants[i * size + j][2]);
            }
        }
    }

    @Test
    @DisplayName("Test First stack against data for 1.7.2")
    public void testBase() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int x = base[i * size + j][0];
                int z = base[i * size + j][1];
                int id = overworldBiomeSource.base.sample(x, 0, z);
                assertEquals(base[i * size + j][2], id, x + " " + z + " Wrong got id " + id + " but was " + base[i * size + j][2]);
            }
        }
    }
}


/*
#define LAYER 24
#define X 412
#define Z 107
#define VERSION MC_1_13
void multiple(){
    initBiomes();
    LayerStack g = setupGenerator(VERSION);
    applySeed(&g, 541515181818);
    int *map = allocCache(&g.layers[g.layerNum - 1], 1,1);

    auto *r= new Random(4227552225777);
    int size=16;
    printf("{");
    for (int i = 0; i < size; ++i) {
        for (int j = 0; j < size; ++j) {
            int x=r->nextInt(512);
            int z=r->nextInt(512);
            genArea(&g.layers[LAYER], map,x,z ,1,1);
            printf("{%d, %d, %d}, ",x,z,map[0] );
        }
    }
    printf("};\n");
}

void one(){
    initBiomes();
    LayerStack g = setupGenerator(VERSION);
    applySeed(&g, 541515181818);
    int *map = allocCache(&g.layers[g.layerNum - 1], 1,1);
    int x=X;
    int z=Z;
    genArea(&g.layers[LAYER], map,x,z ,1,1);
    printf("{%d, %d, %d}, \n",x,z,map[0] );
}

int main(){
    multiple();
}
 */