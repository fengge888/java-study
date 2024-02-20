SET NAMES utf8mb4;
SET
FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for demo_order
-- ----------------------------
DROP TABLE IF EXISTS `demo_order`;
CREATE TABLE `demo_order`
(
    `id`          bigint(20) NOT NULL AUTO_INCREMENT,
    `user_id`     varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
    `order_id`    varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
    `ps_sku_code` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
    `qty`         int(11) NULL DEFAULT NULL,
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 179 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for demo_storage
-- ----------------------------
DROP TABLE IF EXISTS `demo_storage`;
CREATE TABLE `demo_storage`
(
    `id`          bigint(20) NOT NULL AUTO_INCREMENT,
    `ps_sku_code` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
    `qty`         int(11) NULL DEFAULT NULL,
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

INSERT INTO `demo_storage` (`id`, `ps_sku_code`, `qty`)
VALUES (28, 'ps-01', 999894);

INSERT INTO `demo_storage` (`id`, `ps_sku_code`, `qty`)
VALUES (29, 'ps-02', 2000);


SET
FOREIGN_KEY_CHECKS = 1;