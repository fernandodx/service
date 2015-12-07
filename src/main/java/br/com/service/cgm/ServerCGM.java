package br.com.service.cgm;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.service.entity.Device;

import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Sender;

public class ServerCGM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7804914354117999627L;


	public static final String APP_KEY = "AIzaSyBL-pcN3VtDS2byln8-JoGt65DRU2y-fdE"; 
	
	private List<String> listaChaves = new ArrayList<String>();
	
	public ServerCGM() {
		super();
		listaChaves.add("APA91bGI7ugNg5U8sXp12-1CC4ceo6RYX3kc6wCjuC4-jUUbi0nI4hgwvLr2vW7UOVCPRMaq-5NhEduQ6EUd6EXWmZnUBqJjbqlzKZuNBe8FTKRSe3436mzPQVZ9ibwTQBIwn4djkYv2");
		
//		listaChaves.add("APA91bEv9SDcm-jNngTOlfyDbFC7AN0JNNzEni18TRiLCkQ9D-hzR4tjgm385evMnoCAgpN0v4Y_FyDzh9tnClbKbjy0AVr-eNs6qEMqcdU0HCH7ge8f5SRKq_Ltjj-zuZ1pDDToF-Jh");
//		listaChaves.add("APA91bFXA6oXk6lzRPAmyeNsf4bE4Fo8mrPC8xCH64gi-7YIPmIMeXhIC4BpLsa0JgTTtgpkROJxnebedPz5A5IuVc3SKDBsrdTE4WmhHvuEA6Va29XXFKDR4bJb7XLVz2ZxLSWHAABw");
//		listaChaves.add("APA91bH7sE1-hKlO0aiGTgL3jYsGZ1PSJvAHeLPZUcx_RKLaYtP_PqUXF_HNMvkHKtF75J9sOPMZwXQ2DN_8QNiVlHHgWm0HF19jL629tdstM4EW_Uo7cfY3yXw3FjtJCNonB001dDz-");
//		listaChaves.add("APA91bHu_mOsbCPsWg-GH03IUMl9WBNEiqb7grpU3UJsEBM-Td54LwPuVZmXZzZsjS5Z1-7pJSApS2dukk_mNrIhis_kmqeSAXU2Q0yZiRn-zegKv4WifVRg3rWe_H3tBShxKhNUlKdO");
//		listaChaves.add("APA91bFuc923R_MTiJC7MeceLckD9ocFXaLSe7QHsvGLOkQUMhM3O_tMK-WrKTdYYuUbO0lnVAjEjstlKgLX1DL6g4FLpBp5kv3kKiMyL3WMPDNgkOYxFK4E-djJlvEwtl4QCAY7NLxH");
//		listaChaves.add("APA91bHO4d7JaVug6Jz1nxh4UHzu9n8Sniqv1_oqOeJrojIJKK5sLj3rQDM1SpusmcPu_7URJsKTNbQnCsGUdOjw-MGYHHK_7H7pIM_mkUCHFwo1eUaklvCqP_3PjxVbE_g-tr1I8fND");
//		
//		listaChaves.add("APA91bEs0vQvI2tUWsLHCa21ugOwvS4lU7UaKa5MrQitX8PgHHoOBAe9Jh5BrWbqrEuNHjlegbB8nXaWvABSx-ene-gHURAmhwEmW0D2NsLHeEt6S-vJhW6SaU30cARG-0Or0EtNgM-Yv5XvPJmpC_mAwZLNKmr4Gg");
//		listaChaves.add("APA91bFd1sMgjEwKGnIqQw3VUQPC_Vhwmn1MDDGGE-8RfKXWjeXD06KQoQNALtvJ9E5Ore-HNjknxYEKgy23gBEB65DmX4sKHnwt9HNK5blg0QBAs8F5mp7HL2yYSGV4NyOyE_qT_PSc");
//		
//		listaChaves.add("APA91bGiEQLbiqG9EMfFCTn8Oy4sTwqs3IEWAPum_239TiwKKvM8HcbdmNicPfCHYKkUjZ-LvWdGiCclcIK2LPlYtDcFdvyRJoXB28CYI5kv0btq751lcPomBvQdMfKlWWIgRSsDhis3tSWzYFwVNGYvKi_x-CQQrw");
//		listaChaves.add("APA91bHTDftIMGVaTmdnGDKGj9n6aS9zu4cqO6DG1uYedt5DxCrl8ghdOQ82gb7jLZiVs3KOJMbep-k2eQL5GV9Rr7sTgDwm8auoyfqZOkuRaVb2v-d5R6ozvknBbt-fvZ_rkfM91Mz96SGtMkyWAwzMhY2KxGn__g");
//		listaChaves.add("APA91bG80bzARO_0gtG8OQlgGPPiFOSA9o_817Idvg-_y8lePwQ76yLpWoz0rIGVXTsREtOLkRyqOXmB2UsvlxkH7vyWhFTKeftOtBMjXIuqPu3dTKd3yxJoLslfCVX5iS-X507tm8SWxNG3NBy0DZa8IQ4oHhFBaA");
//		listaChaves.add("APA91bFAHHBikYgzbUQW6PBkDpOgpzK-7IXCxD2jmuh7nanrCof3m0RAHtyRf3tG4S7N8tV-aRvcUlEnVnyxOQ8oHNGuRNg5_lHcNvDNKUCeMYEOVyu5lbBlRf1VUEW88xKs58svlzqULCvVH-HK2fV14AiKeykSIA");
//		
//		listaChaves.add("APA91bE6Ii_ppN86DOvEcSJXCpvwGvUQJqA3Z-dvskktiPA6Fce1OXnOwWvj_bbE1Vos0JyICcDLGlIoKMNJ1X3zcTfg_X3CiMqq_3sGJsfUoCcr1JU6a3L8ydU4yP1lMbHOES64_ymrNjCOjvVgw2eoZynWVfTcIA");
//		listaChaves.add("APA91bFdBvmITUIucH8fAFyUI3DyYXVMk7EFUNyHqIPr27VbALKmmrrOxJjmpEpMTk2Hz99AreixggCi8r1a6LS4vp1vBlAW3Kbolb3L0ca7IPbIydUbcID0B06tCMXrN-Fb9QvI4CH35QhPsO9dN0z5SbnLJo9UmQ");
//		listaChaves.add("APA91bGCxP9N235mBBbromRNFayu4a-URMB9GZNfTUc4sisI6gySDMAg9hI5FfCmfLcBdhA9-pMWRnDfFBf_qHGdwnY7DxTNxW0qNiW8AB-d2_qmVr4X_lzTjrYvneUBJvQD275E2e0HbVVwb1Kia9HAUMjpetjZfQ");
//		
//		listaChaves.add("APA91bG5RunVY1jqL19TjOG18H85qqnQ63M6wzMKZPthDwLzAwdFI0RI0ZtyC0YoxT-Ubm10Y4m79FETY_WE_He7bRSKSMUy5bqUaOFAXmVeGk_SYEmERIYJq25hBJ6ogIQDsbph4ucPTu62lQ1vSibhDKBNtuhGeg");
//		listaChaves.add("APA91bEpPH-OuaCHgBgKt_OpWrDENDSZL3BGniIKhIg_3RW6M0usfS9xJIbTiPX3QDnUw6YN8QyfS9kDSF-HS7OS5nevi_6DOfrrznRvG1bVydSje0APYOA2kA1P6_IEZp5Ka6PxmaihdSsj_QIODZlMBE1KoPOtuQ");
//		listaChaves.add("APA91bGt8ASdcBuQLjtMJLmvBWCxl6WEaRVZfVppkkTwdxSpf8NDfBOcIyqbl2-zPb9Jdy3qe_8lxcIcyJPo_lAA4Nu4qtw3phN_QQT7nQcZH-VekC9nzs-D5lCa77haIortFkaKvn0TAmzNdxFoE8j3MFlsP5nyrQ");
//		listaChaves.add("APA91bEyQZS7vLrbHpNz-9HFf10eQ8d11i6WAngMPcVL6icrqK8ZGt7rXEGbSUSX-9v0duFf_Ez56MZYx1Yi8Gkl-d2gwg7ysQUGYjKDPLQmobNgtx3UO42LM3Tk0taFCifCAD0hbV6aWM3RXc5y13KFP2K5RWQ2fw");
//		
//		
//		listaChaves.add("APA91bHMqsePeGIAkAtS2YZN1hRm2XHRga4xiwxs2O-ch_AWNxFZMRcsvAwBko4Z8dAViYLiSXYFnub_yx7yb33f3la6OgPYT-tYjunrvMnln9enZqkF_PrkcbeYFKapbQRu9ZYSwfxOy_l6erfR7rmvp3DMcyiYzA");
//		listaChaves.add("APA91bGEPjnY0fGAAgYMa2FSQzqWbJVmyqrqPJJL5k2v7q-34dzH_lIiu07jtt3goUU_7E6Ho9yiaiFYL6q0Jqt7L-yI3WvbhzQDUwlHQ8o_dz4XvHbwM2Q72ltQzvJ-frzadPqJRpUwFskFnx-TlfA_LZgOpj4eKw");
//		listaChaves.add("APA91bG5YCPPl4b-cfEd82gtdw2STKMVmpDVYJt6oUWnmUlNIS5tcwMxTEc3307XDeNNr0sR-JgPrRdkokk3VrOjbW1D6gSwwz5TxqTuxqTrEYhV8lKqK16SoEnmX5morjx3hqBmxC9yHUI3daTm6aOHUOPa8Zu10g");
//		listaChaves.add("APA91bEeFIOrVCe9cmzIQJB4sVXireHTKTOLfcQ87bKZwSIcmpb0SiixUW5Egb2LuR2yU-UQQAQE_AiAfKLpZOAoZYKXfzsa7g47PGNgXtCfHwsvH84AP5VEU42IBFv25hTtPX6Mz4dlyKwZaaaYrSMeE12PPbY3BA");
//		listaChaves.add("APA91bEPQNzEs6FDb-9Ba34gOJ0nb59tUNlAeBqCKCBP-zLcmNJi1xi5eJFOgGkp_P2bbYJtwZlGABEXzWA1kN3nYe9lWfSupe-qIai9OPsqQVEmu3sxxwf-BqVdLwzjG7aKw-r9Aj4E0NIxkHG5T8aOkOpX8C2iVQ");
//		listaChaves.add("APA91bGCzwIYIcxUCrcyiiTruSBYK9Tqci0fXA16-0DMaSqgcPkMyAKUCCBZmRZULRy-9C_nWZTh89vJWz1xS-oFbEYnUhHPscg8wEZVJHr-Ki2OXkd7Jd0s8K4GGEvqvB-krwZIvySlCPzjvg9wRc3tGgiifMI7Iw");
//		listaChaves.add("APA91bFl4XBX0HSI5zYGxoSkcO3wIOZyGrbv1rmmmO4aiglTOpw6iy2Un161xA7KcdJ4Pk7HDY3YnmSuJ3xuwNFI3cjlCeCMSgJShCKbCrqa51d1eEl3XcbKThrEpM6TxlkAdjaburft6um8WVnrWUnLcl8IGb0ujQ");
//		listaChaves.add("APA91bFKRHGZYkh4tRI8J71IVMZeYcSBmtQtdL71k2u6ag4oEAbjK_6yVWGzEpOdp1BqHQgMsOB_Q6zBQqcgZfr4v_sEOnNDVSnppd20h-y36xgfuNFYZQtb9OSYsKzMKeUJSOwQlDtiaNp9FJYBD7eLKvrUUf3iBg");
//		listaChaves.add("APA91bFAY6W4bcJYAHQOT4MiHcPAmYP5r4mJ4bZmwTnsTfiLaERANPYslv7xhJFuANwNY_8AOXfnAUQfUmKO5sux2bh_0hXqy1jnDDSjV47g2I4HddIJIQOM6qBV27uuxqs--rb07MRWhJZZNeE-7gh3npSf3hQAuw");
//		
//		listaChaves.add("APA91bGgsl5xsYNcEdcSvBT2h-QP-ZiU518BmNxqgrO_jJC0W986Xwjd7U7QFP_pS6-Khnm9VnCoH_kFbp7JDwVcCqUmj91h3opjBnV_rLH_U861fMOB0HCyVCLmEDHY6KR8mCrNP6Vin_bBoAcRdOyxontIzYlecQ");
//		listaChaves.add("APA91bE9Mfj3vqOV9bTdi1iV0Ju7fZ0HpFoCvYNxaNN605y0488Pd_FDkh0i1DjLBdfDU6L7GqkUemHxl7IIyKmUywlpF6wI4g3iwiKsQcx69xfUGXbGVtJwRKcAksmmBD4q6Y3MzQr6QsDxz_Bdc85VPVNkCAXvqg");
//		listaChaves.add("APA91bET2Rms2Q4U5CLo_QP820PxhF1sTIp2ezlNdKUmpNSaXsu8MUpctXP4tN7kWsRynKgWlZntycG5N9O0EWzgrTZ_H4zURXqg8I_XLJJaD6dKhlOt53nFpcPYZOc5RADRxWizTMd1MSDyNwDmMx0b5mtxQxrifA");
//		listaChaves.add("APA91bHFKZQOlCWEubdCngg-HSuUKdXPcE8S0pONUHgp9CbkL6HxTOgH1kXXhk8V6c2aRaSt0QU67b-yhHd6n4ceLIqV9u8ND3VFxm7UgcOTbVsG-prkSkFt2OK9CDMPoQ9Dul21t3yc6iUqxT8LoQYJNoLaPhacZw");
//		listaChaves.add("APA91bGgsl5xsYNcEdcSvBT2h-QP-ZiU518BmNxqgrO_jJC0W986Xwjd7U7QFP_pS6-Khnm9VnCoH_kFbp7JDwVcCqUmj91h3opjBnV_rLH_U861fMOB0HCyVCLmEDHY6KR8mCrNP6Vin_bBoAcRdOyxontIzYlecQ");
//		listaChaves.add("APA91bHeTC3kD_1sDfpzaCe9kbfFoOHLvzymG3-dXHf6VGDBJ8eekJ1UpZe7jgLkFVD0su6AJst3DOm09-k7emqHMNlsJq5EBlOVUKHCbku6Bx_HAmAr1gnuSjJHts2j8UtTBeggQyRXYSTd5bSNzyLbjJcpU5QCQA");
//		listaChaves.add("APA91bGi2OJ7D_ZJm50PP8udk9oZqmdFxvjHiL5gWcSjxd75J6a57GOpqBTW6NvbV022oafi7CfvBOXCPDO3GmiVvUSkJGhB2tT-J5ZExCdAC9vrfmfCdn91zHW2HFCUT_14UOOJLCftl0IU-MNmmbhJcOzZR1MLsw");
//		listaChaves.add("APA91bFbms8PGhrvYoDLmLpfQeln5UXDa3gPA5HVmscpSx-dblJNuh3l-fnuGXYTiWIknftxQq7U8YDeKCNTz-aiQwg2L8XFKzPQKyn3r7Lg7rLvRCjRt8qfGtifQWYBBegYvNbdKb-PPJVNLpARFI6ix_CTrLvqoA");
//		listaChaves.add("APA91bH8BpdfRqxB7mIK4rNw9kFfiylWb77oo9GWBsa3-bXHjyzj_TXOnvxXmPSjtSJmH41wYjO0Xw6fTL8AypiIOOUrU63Cur_vhj053XuYn2RR_NoYeL0N168Xfyj9t_LKe61Z7emDLABsj6bFCq6lX5j-jiPEqg");
//		listaChaves.add("APA91bGemoWshFEZgbwHFfTX69RV_kwPh6Ldk8G1CEbaUZs1k4OBdxCJ9_dpqkgS2NbXG-YbrUM1X8E_U0CepWrhlggIahU3s2d5iGKMG9mQyBwW71hfjgiN32qge24K3ohWMgfjxN6Bp63eXAkVgwcYGwCpjTHaag");
//		listaChaves.add("APA91bFIqR9LNETvd2h_1sznvXZNbmUM5TMdORpkkHeX6N8XynrStTDiONvmR80puQ45UA3jlESPG8eIoLrlXKC_N3o8JzDtIISquH1WPTHQe_WXBXSLm8JLnW3Rm5ccHtMrGn3DpIdmRh5BDLEUhT7zOY1p8AXphA");
//		listaChaves.add("APA91bFBAqykMGShjfS6Qol9o_46sPxEz5eD_kp64zBEbP5mfWrZd5xI5hLyqY2a3wkKWG2lXevB5c6cIDAA_UwKRkaaTQodKd3UeLltES13bBjtBDWF6dJs6FLV_HUfKNiG301-StdFDqhTo86mfItwrQ4hsyk70Q");
//		listaChaves.add("APA91bF1RhwzAoE0h0wFwwPWjaIJ7e4-M2fgy-Xk-lRZH22J-A5sNbDLIte8TIXu2JzGntTE0rLZAIPTHq7qM5YVZB2qmY51w2AeYsutFT0HMJYI8Q71uH3aGfgE1p4mbh4qQwq3hpIJrcHGoI6pbsryL9hpdgxvNA");
//		listaChaves.add("APA91bHGkyuFGFrmO-QCeOqNK1La0Cwi1mPoRwQ14TAiztimK0lZrxIVo3ZywSxL50xHLaH25LVuXEe4KnXEaIlr5uSBEgPJtT1LjTeuPkIyGuVxGzTFd-0ZM72kXKP0r0xm6gj0DLvNQN_YFXLbY2cxbQPbabOt7Q");
//		
//		
//		listaChaves.add("APA91bGemoWshFEZgbwHFfTX69RV_kwPh6Ldk8G1CEbaUZs1k4OBdxCJ9_dpqkgS2NbXG-YbrUM1X8E_U0CepWrhlggIahU3s2d5iGKMG9mQyBwW71hfjgiN32qge24K3ohWMgfjxN6Bp63eXAkVgwcYGwCpjTHaag");
//		listaChaves.add("APA91bEUr53pnbryIO3Zs5XN2c3t6-K0CzgQk-qmJgxJ-aliNx58I4TPAPXfpJkM4OBBCFco8OvsItf7Vt6If1DvtC1sJQJmDwZNpWg4ZbhIjmKFG7qcD4KcAn9Z0PmSnrwsdizI9irXWP-vf9GlTVi7HW3m1rpjtA");
//		listaChaves.add("APA91bHFKZQOlCWEubdCngg-HSuUKdXPcE8S0pONUHgp9CbkL6HxTOgH1kXXhk8V6c2aRaSt0QU67b-yhHd6n4ceLIqV9u8ND3VFxm7UgcOTbVsG-prkSkFt2OK9CDMPoQ9Dul21t3yc6iUqxT8LoQYJNoLaPhacZw");
//		listaChaves.add("APA91bEs0vQvI2tUWsLHCa21ugOwvS4lU7UaKa5MrQitX8PgHHoOBAe9Jh5BrWbqrEuNHjlegbB8nXaWvABSx-ene-gHURAmhwEmW0D2NsLHeEt6S-vJhW6SaU30cARG-0Or0EtNgM-Yv5XvPJmpC_mAwZLNKmr4Gg");
//
//		listaChaves.add("APA91bE2-EYM0AKqab5MEsTzsu_nWzun0x_Or23qe8TuPNHruUTg0YirfcLitA27NRcbxRYlF1YpxGhkGZMZQ_4H4oeAnUJJmQqZ3YEJ8pJi1yea2ncFiCDj361tFZa1nMS48NJ9ru1H-P-YeLb8gt-EM4KsZVVbbg");
//		listaChaves.add("APA91bFKRHGZYkh4tRI8J71IVMZeYcSBmtQtdL71k2u6ag4oEAbjK_6yVWGzEpOdp1BqHQgMsOB_Q6zBQqcgZfr4v_sEOnNDVSnppd20h-y36xgfuNFYZQtb9OSYsKzMKeUJSOwQlDtiaNp9FJYBD7eLKvrUUf3iBg");
//		
//		listaChaves.add("APA91bEwhtH2OqTczy1Iv_1u7of9C59wgZZvht3XMSm0oJ2LLGCZ6AogCRNkdZgnLTwOH7KUBmSIyQtx8D9bYd5CeFpibfgcqIZVoWPqXbVoYWEjf81068GHB_s7M7Ivd267PD4bCm21iGeJTpzO-T_48JFrGGEEjw");
//		listaChaves.add("APA91bF1RhwzAoE0h0wFwwPWjaIJ7e4-M2fgy-Xk-lRZH22J-A5sNbDLIte8TIXu2JzGntTE0rLZAIPTHq7qM5YVZB2qmY51w2AeYsutFT0HMJYI8Q71uH3aGfgE1p4mbh4qQwq3hpIJrcHGoI6pbsryL9hpdgxvNA");
//		listaChaves.add("APA91bH1kYRaXo5ioYjM_F5x_VZCMZRroPT10ex3lGfVjYdiY6JeLjZW1UFYfiKqX4rcXFqfc3H4w753yitL8GtaSwXJ2yuTETpy6bSUKYF4gWTj-cIWVsKn-xzHJDPN1CHa2BRYqbfZ3k4YMttymoa9IRboKAdviw");
//		listaChaves.add("APA91bH8BpdfRqxB7mIK4rNw9kFfiylWb77oo9GWBsa3-bXHjyzj_TXOnvxXmPSjtSJmH41wYjO0Xw6fTL8AypiIOOUrU63Cur_vhj053XuYn2RR_NoYeL0N168Xfyj9t_LKe61Z7emDLABsj6bFCq6lX5j-jiPEqg");
//		listaChaves.add("APA91bET2Rms2Q4U5CLo_QP820PxhF1sTIp2ezlNdKUmpNSaXsu8MUpctXP4tN7kWsRynKgWlZntycG5N9O0EWzgrTZ_H4zURXqg8I_XLJJaD6dKhlOt53nFpcPYZOc5RADRxWizTMd1MSDyNwDmMx0b5mtxQxrifA");
//		
//		listaChaves.add("APA91bEpPH-OuaCHgBgKt_OpWrDENDSZL3BGniIKhIg_3RW6M0usfS9xJIbTiPX3QDnUw6YN8QyfS9kDSF-HS7OS5nevi_6DOfrrznRvG1bVydSje0APYOA2kA1P6_IEZp5Ka6PxmaihdSsj_QIODZlMBE1KoPOtuQ");
//		listaChaves.add("APA91bG5YCPPl4b-cfEd82gtdw2STKMVmpDVYJt6oUWnmUlNIS5tcwMxTEc3307XDeNNr0sR-JgPrRdkokk3VrOjbW1D6gSwwz5TxqTuxqTrEYhV8lKqK16SoEnmX5morjx3hqBmxC9yHUI3daTm6aOHUOPa8Zu10g");
//		listaChaves.add("APA91bG5RunVY1jqL19TjOG18H85qqnQ63M6wzMKZPthDwLzAwdFI0RI0ZtyC0YoxT-Ubm10Y4m79FETY_WE_He7bRSKSMUy5bqUaOFAXmVeGk_SYEmERIYJq25hBJ6ogIQDsbph4ucPTu62lQ1vSibhDKBNtuhGeg");
//		listaChaves.add("APA91bFOTF9KOSoASN_SfR4aKN_ZTfS9wvgedHCRbUhiz-pXtLM2x8mXajwnFbkJhzAfr_6p06w-wUOZwIfTNwOY-a_QouLqWSX8WUhuIkNtgBtmz3oaa8p65Z7czwDDofB3YjRYBvzdfXcJUk73YaeiOCBICMoI1A");
//		listaChaves.add("APA91bE5bGvLtM7QCLxG-dH81r0Q8GJL6hVBYT6xaDO8lbLF-K1x0O9RV3xrLj7ymD0LWktuxxr7wmZ46WLOndY2ve3UhfMJY3jwTeaDB1jhCVu7SUedbtbmk0OTiSsjMTiY0Xk46n4IvMNCJplWtaZp4DGnVvYayg");
//		listaChaves.add("APA91bFbms8PGhrvYoDLmLpfQeln5UXDa3gPA5HVmscpSx-dblJNuh3l-fnuGXYTiWIknftxQq7U8YDeKCNTz-aiQwg2L8XFKzPQKyn3r7Lg7rLvRCjRt8qfGtifQWYBBegYvNbdKb-PPJVNLpARFI6ix_CTrLvqoA");
//		listaChaves.add("APA91bEoB-Nlm2-zap0RH4vQeazUM-UTs9eeVP48FeqOMawcjoaOrxZ2Lc1qXyBbHjdRNyEAZBEC0CR1m8rpV1tgol-g_quNXsC6Y4ljNEMgBfm2_DMC98BOBUp_WpKxFoIGPhunx_yJULtC9dTWlsERsrg8xa04Wg");
//		listaChaves.add("APA91bGgWi6c89J_F0eBShxJHm2RkJ6IcM6oysJDe6VAVidnhlrS1mVWzuvp7yCdCswKxlgk07zwj49zKRxN9zsbBkhhkU0iTfnYiX9cRTyQVkogC3MhVxhGGFpaycmABRehhBHQPmq46Dv_ylWcomkUwR5kpJmOIw");
//		listaChaves.add("APA91bEeFIOrVCe9cmzIQJB4sVXireHTKTOLfcQ87bKZwSIcmpb0SiixUW5Egb2LuR2yU-UQQAQE_AiAfKLpZOAoZYKXfzsa7g47PGNgXtCfHwsvH84AP5VEU42IBFv25hTtPX6Mz4dlyKwZaaaYrSMeE12PPbY3BA");
//		listaChaves.add("APA91bEPQNzEs6FDb-9Ba34gOJ0nb59tUNlAeBqCKCBP-zLcmNJi1xi5eJFOgGkp_P2bbYJtwZlGABEXzWA1kN3nYe9lWfSupe-qIai9OPsqQVEmu3sxxwf-BqVdLwzjG7aKw-r9Aj4E0NIxkHG5T8aOkOpX8C2iVQ");
//		
//		listaChaves.add("APA91bFStz6GKIacSEA4rVhe1TIurkbe5XDfzlrvGUH6CtnGjOZmOaDyxEVT3x_-gVll-IPFVB689V4YtdLQDGKKh8lscYbOwet-ZpACnug5UVlQzUc3Izo3qS-XOunL9fUfNKOIrhzGOBhweiCdzU0Dxzozw49MdA");
//		listaChaves.add("APA91bGX2anneGWFLotXAqmurDmqN8MHKEn2KsmE_Zxg7qtnagr2rzmZjs0sVpJxJ2Jqmj1zxRw_RlkMbxPHSxpdl4cKzQDERpRi_zShun8CdTftzejE4cc-VKrIGid0AQe5q7b1760_YlIBahQ0kmHw900eLHa5Vw");
//		listaChaves.add("APA91bFBAqykMGShjfS6Qol9o_46sPxEz5eD_kp64zBEbP5mfWrZd5xI5hLyqY2a3wkKWG2lXevB5c6cIDAA_UwKRkaaTQodKd3UeLltES13bBjtBDWF6dJs6FLV_HUfKNiG301-StdFDqhTo86mfItwrQ4hsyk70Q");
//		listaChaves.add("APA91bF9SdC6gLRUqbj_1rSmbG6A1UVtyGzpMtJyOLLUql3zZ4pQLYft__MjvX_iXuIi2-CN3cOrE46PIE2kifSrGVg7NR1i9obegENYBaB0jfdMtoLqvuvM12ZKF7GmhGH0JEWnfuTF-DIE-_rGdffOMMZYIgQebw");
//		listaChaves.add("APA91bEPQNzEs6FDb-9Ba34gOJ0nb59tUNlAeBqCKCBP-zLcmNJi1xi5eJFOgGkp_P2bbYJtwZlGABEXzWA1kN3nYe9lWfSupe-qIai9OPsqQVEmu3sxxwf-BqVdLwzjG7aKw-r9Aj4E0NIxkHG5T8aOkOpX8C2iVQ");
//		listaChaves.add("APA91bFbms8PGhrvYoDLmLpfQeln5UXDa3gPA5HVmscpSx-dblJNuh3l-fnuGXYTiWIknftxQq7U8YDeKCNTz-aiQwg2L8XFKzPQKyn3r7Lg7rLvRCjRt8qfGtifQWYBBegYvNbdKb-PPJVNLpARFI6ix_CTrLvqoA");
//		listaChaves.add("APA91bET2Rms2Q4U5CLo_QP820PxhF1sTIp2ezlNdKUmpNSaXsu8MUpctXP4tN7kWsRynKgWlZntycG5N9O0EWzgrTZ_H4zURXqg8I_XLJJaD6dKhlOt53nFpcPYZOc5RADRxWizTMd1MSDyNwDmMx0b5mtxQxrifA");
//		listaChaves.add("APA91bGQ9HYHe5Ivl8aSm4euuObzYu7z2SlEq-lNK4TynwcnvlX-TxJ8jE9jiTQphnJfd7-MQ17CnUamG2QtcGtffooNYzuMRBzpVQ_hYQjPPh0ODZHEFX3MbDHVLgeHtmdH4fRFHh2UFawlTx3TqMG4Ka2vfV1Sxg");
//		listaChaves.add("APA91bGTgkGh562DsipUpquXpEl1e7jZp_sAFFHWxyQwP801gtxSt-VKIGJxtRTTJ1uEV49r5q-5nXpZwV-A9y1azu7Snmlvmtkxs7xrGxOs7BSJIJB9O2LugSH98HrMEnZZzikR77AeRnxbuiAT8nUEfQclTMlR-Q");
//		listaChaves.add("APA91bGEPjnY0fGAAgYMa2FSQzqWbJVmyqrqPJJL5k2v7q-34dzH_lIiu07jtt3goUU_7E6Ho9yiaiFYL6q0Jqt7L-yI3WvbhzQDUwlHQ8o_dz4XvHbwM2Q72ltQzvJ-frzadPqJRpUwFskFnx-TlfA_LZgOpj4eKw");
//		listaChaves.add("APA91bET2Rms2Q4U5CLo_QP820PxhF1sTIp2ezlNdKUmpNSaXsu8MUpctXP4tN7kWsRynKgWlZntycG5N9O0EWzgrTZ_H4zURXqg8I_XLJJaD6dKhlOt53nFpcPYZOc5RADRxWizTMd1MSDyNwDmMx0b5mtxQxrifA");
//		listaChaves.add("APA91bE2-EYM0AKqab5MEsTzsu_nWzun0x_Or23qe8TuPNHruUTg0YirfcLitA27NRcbxRYlF1YpxGhkGZMZQ_4H4oeAnUJJmQqZ3YEJ8pJi1yea2ncFiCDj361tFZa1nMS48NJ9ru1H-P-YeLb8gt-EM4KsZVVbbg");
//		listaChaves.add("APA91bFAY6W4bcJYAHQOT4MiHcPAmYP5r4mJ4bZmwTnsTfiLaERANPYslv7xhJFuANwNY_8AOXfnAUQfUmKO5sux2bh_0hXqy1jnDDSjV47g2I4HddIJIQOM6qBV27uuxqs--rb07MRWhJZZNeE-7gh3npSf3hQAuw");
//		listaChaves.add("APA91bEIpE5WRw58aEQSkq4I0UnnfoPH5IbXmi5iXouTAM2IoBe-qDKvc3RZYAyfx_p7guEcdamNc1WnFLSQi1vfgPBdPs2p5c_R0JLL0vKqcUEQm6ydSnPTwwW1IuEH5qYF4l2DyOPSRX5kugkH32FuLqyaRX3_AQ");
//		listaChaves.add("APA91bFKRHGZYkh4tRI8J71IVMZeYcSBmtQtdL71k2u6ag4oEAbjK_6yVWGzEpOdp1BqHQgMsOB_Q6zBQqcgZfr4v_sEOnNDVSnppd20h-y36xgfuNFYZQtb9OSYsKzMKeUJSOwQlDtiaNp9FJYBD7eLKvrUUf3iBg");
//		listaChaves.add("APA91bEpcbiPJ6LceaxJwMvv-Nnymr6FiryzCju24dI9GpHjrobhZjBW0oqWvmxM7fs4SniMMSya3evAIyYNN4bUE32ApO-LhNNuAPjFskqOc-r2G8tzSLX3aNbMO059BX0cIooOyW-dn5vtS7g04ydaOJcm-GqG9w");
//		listaChaves.add("APA91bEc18Yt3PDe0UZjoZ2kxMd42AZFZiyjFXZDdkrE7nVZZBVhWBxr0DFoXnbVUO036AmPWxEB0Ytv6mt2RKMdCwGTdfflqapc2FZGtfQrZenbxwAK65UhJ8TdKPvFIwZWL8uFQmT2byUeJn5lErFOIqarQwCA9Q");
//		listaChaves.add("APA91bFfxglbdWY3hQrPQGI6hPiyRM4Rd4YHSSBhDtbIYeW7M3Og9P0w5Ox10jLEWA7fIg5Lq01YQdoUSx8KeU09nKxvjQRAnXwkGTQS6BtWWfgFKv-IEz-p8vdy_JW-Mb2GQw8VO8OGxX8u0kDHvYhqoJZTQ-q9VQ");
//		listaChaves.add("APA91bHJEQ8T3PDYQcrV-AjqsiErIeIBYoIqKJOWV5qzJgGH2f8IU8RRyNc-3hlu02SrtZGNZPI3QKHe3RDWnF4QRmP-03ll60Ip7t-T2NCJiZ5NV6szWScFWxRv7eBPBDnJvFz-IO-mZ6X2RUSoLhHj4gt2l3ziQw");
//		listaChaves.add("APA91bGgnBwjv0DrnQ1woZ7hndnOPCsxSaf2IKL54UciXFhiOkcBsurA0rjOAX0Mhn7_z3W3zKQrjrw3kydHmQL3v73hL3qqoIcg2dgEfDK6imVR5uhHSBGwGpm3rJq6FI72FyruV9JkviwB1hQ-BQTmuL6BdI4l2Q");
//		listaChaves.add("APA91bEeFIOrVCe9cmzIQJB4sVXireHTKTOLfcQ87bKZwSIcmpb0SiixUW5Egb2LuR2yU-UQQAQE_AiAfKLpZOAoZYKXfzsa7g47PGNgXtCfHwsvH84AP5VEU42IBFv25hTtPX6Mz4dlyKwZaaaYrSMeE12PPbY3BA");
//		listaChaves.add("APA91bHJdyJM5Px7doLYGqRBhJgi3Rk4NByWWx304_QVYTH_SIitaY6ZhD0yqJRmsC41mSczCD6dBJVkIS-5mxBSjbIgCT03X2vvFMbsnrScdLPU0tO-mzLIirfvxGp30nCkkrz-AYXeY9WgiiACuawZ39ptQrlgtg");
//		listaChaves.add("APA91bGemoWshFEZgbwHFfTX69RV_kwPh6Ldk8G1CEbaUZs1k4OBdxCJ9_dpqkgS2NbXG-YbrUM1X8E_U0CepWrhlggIahU3s2d5iGKMG9mQyBwW71hfjgiN32qge24K3ohWMgfjxN6Bp63eXAkVgwcYGwCpjTHaag");
//		listaChaves.add("APA91bGPpJgpQzAILMAqgI6o_eufX9Z5cibazGBUiNtNZfrZarSUIlNrBmrwKOL50gSmNNFNJTVYGfTE9pCOU9VVuaozjzp20udc44lfjTa5dhPJotaKh6jzhvF4htRYz841IJ38ljAFZgOdaQiaZBh6hyB7T7qaWA");
//	
//		listaChaves.add("APA91bHsoEHXJa8m52eZ8QuyMSVpoOdL33VzxNAAeDVwf8cDPjm1UvWmIw9xlb3nRXQPT5NcU7G7LEapwZQCBRt4blYSPIBm764FC-OaIezcWgkGQOiDDZULBo3PIYqK-6521uv3yCH9tP52yiAYMV_bjBlO4KPXMA");
//		
	}



	public void sendMessage(String msg) {
			
		Collections.shuffle(listaChaves);
		
		for(String chave : listaChaves){
			
			 Sender sender = new Sender(APP_KEY);
			 Device device = new Device();
		     device.setDeviceGCMId(chave);
				
			 Message message = new Message.Builder()
					.collapseKey("1")
					.timeToLive(3)
					.delayWhileIdle(true)
					.addData("gcm-message", msg)
					.build();	

		     com.google.android.gcm.server.Result result = null;

	         try {
	        	System.out.println("Enviando mensagem para o dispositivo " + device.getDeviceGCMId());
	        	result = sender.send(message, device.getDeviceGCMId(), 1);
	        	System.out.println("Mensagem enviada para o dispositivo " + device.getDeviceGCMId());
	         }
	         catch (IOException e) {
	        	e.printStackTrace();
	         }

	         if (result != null) {
	            System.out.println(result.toString());
	         }
	         
	         try {
					Thread.currentThread().sleep(50000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
		}
		
		System.out.println("----TERMINOU-----");
	}
	

	
	
}
