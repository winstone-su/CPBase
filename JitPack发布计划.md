# JitPack 发布 AAR 计划

## 目标
将 AAR 文件发布到 JitPack：
- `cpbase/libs/cpsdk.cpbase.v1.0.0.aar`
- `cpcomm/libs/cpsdk.cpcomm.v1.0.2.9.aar`

## 已完成任务 ✅

1. 创建 `cpbase` 和 `cpcomm` module
2. 配置 `maven-publish` 插件
3. 更新 `settings.gradle.kts`
4. 创建 `jitpack.yml`
5. 移动 AAR 到各自 module 的 `libs/` 目录
6. 本地构建验证通过

## 下一步

详见 [JitPack发布指南.md](JitPack发布指南.md)
