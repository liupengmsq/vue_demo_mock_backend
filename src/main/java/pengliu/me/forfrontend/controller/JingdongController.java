package pengliu.me.forfrontend.controller;


import org.springframework.web.bind.annotation.*;
import pengliu.me.forfrontend.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class JingdongController {
    @PostMapping("/user/login")
    public Result login(@RequestBody LoginInfo loginInfo) {
        System.out.println(loginInfo.toString());

        Result result = new Result();
        if (loginInfo.getUserName().contains("error")) {
            result.setErrorno(123);
            result.setMessage("Fail to login!!");
        } else {
            result.setErrorno(0);
            result.setMessage("");
        }

        return result;
    }

    @PostMapping("/user/register")
    public Result register(@RequestBody RegisterInfo registerInfo) {
        System.out.println(registerInfo.toString());

        Result result = new Result();
        if (registerInfo.getUserName().contains("error")) {
            result.setErrorno(123);
            result.setMessage("Fail to register!!");
        } else {
            result.setErrorno(0);
            result.setMessage("");
        }

        return result;
    }

    @GetMapping("/shop/hot-list")
    public ShopHotList getShopHotList() {
        ShopHotList shopHotList = new ShopHotList();
        ShopTag tag1 = new ShopTag("月售100万+");
        ShopTag tag2 = new ShopTag("起送¥1");
        ShopTag tag3 = new ShopTag("基础运费¥5");
        ShopTag tag4 = new ShopTag("月售1万+");
        ShopTag tag5 = new ShopTag("月售493万+");

        ShopInfo shopinfo1 = new ShopInfo();
        shopinfo1.setId("1");
        shopinfo1.setName("沃尔玛");
        shopinfo1.setImageUrl("near.png");
        shopinfo1.setSales(10000);
        shopinfo1.setExpressLimit(12);
        shopinfo1.setExpressPrice(10);
        shopinfo1.setSlogan("VIP尊享满89元减4元运费券（每月3张）");
        shopinfo1.addTag(tag1);
        shopinfo1.addTag(tag2);
        shopinfo1.addTag(tag3);

        ShopInfo shopinfo2 = new ShopInfo();
        shopinfo2.setId("2");
        shopinfo2.setName("沃尔玛");
        shopinfo2.setImageUrl("near.png");
        shopinfo2.setSales(10000);
        shopinfo2.setExpressLimit(12);
        shopinfo2.setExpressPrice(10);
        shopinfo2.setSlogan("VIP尊享满89减4元运费券");
        shopinfo2.addTag(tag4);
        shopinfo2.addTag(tag2);
        shopinfo2.addTag(tag3);

        ShopInfo shopinfo3 = new ShopInfo();
        shopinfo3.setId("3");
        shopinfo3.setName("沃尔玛");
        shopinfo3.setImageUrl("near.png");
        shopinfo3.setSales(10000);
        shopinfo3.setExpressLimit(12);
        shopinfo3.setExpressPrice(10);
        shopinfo3.setSlogan("VIP尊享满89减4元运费券");
        shopinfo3.addTag(tag5);
        shopinfo3.addTag(tag2);
        shopinfo3.addTag(tag3);

        ShopInfo shopinfo4 = new ShopInfo();
        shopinfo4.setId("4");
        shopinfo4.setName("沃尔玛");
        shopinfo4.setImageUrl("near.png");
        shopinfo4.setSales(10000);
        shopinfo4.setExpressLimit(12);
        shopinfo4.setExpressPrice(10);
        shopinfo4.setSlogan("VIP尊享满89减4元运费券");
        shopinfo4.addTag(tag5);
        shopinfo4.addTag(tag3);

        ShopInfo shopinfo5 = new ShopInfo();
        shopinfo5.setId("5");
        shopinfo5.setName("沃尔玛5");
        shopinfo5.setImageUrl("near.png");
        shopinfo5.setSales(10000);
        shopinfo5.setExpressLimit(22);
        shopinfo5.setExpressPrice(9);
        shopinfo5.setSlogan("VIP尊享满89减4元运费券");
        shopinfo5.addTag(tag3);

        ShopInfo shopinfo6 = new ShopInfo();
        shopinfo6.setId("6");
        shopinfo6.setName("沃尔玛6");
        shopinfo6.setImageUrl("near.png");
        shopinfo6.setSales(10000);
        shopinfo6.setExpressLimit(2);
        shopinfo6.setExpressPrice(2);
        shopinfo6.setSlogan("VIP尊享满89减4元运费券");
        shopinfo6.addTag(tag2);
        shopinfo6.addTag(tag3);

        shopHotList.addShopInfo(shopinfo1);
        shopHotList.addShopInfo(shopinfo2);
        shopHotList.addShopInfo(shopinfo3);
        shopHotList.addShopInfo(shopinfo4);
        shopHotList.addShopInfo(shopinfo5);
        shopHotList.addShopInfo(shopinfo6);

        shopHotList.setErrorno(0);

        return shopHotList;
    }

}
