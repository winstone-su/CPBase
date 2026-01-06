# JitPack 发布指南

## 发布前准备

### 1. 确保仓库为 Public
JitPack 只能构建公开仓库。在 GitHub 仓库设置中确认仓库可见性为 Public。

### 2. 提交所有更改
```bash
git add .
git commit -m "配置 JitPack 发布"
git push origin main
```

## 发布步骤

### 1. 创建 Release Tag
```bash
# 创建 tag
git tag v1.0.0

# 推送 tag 到远程
git push origin v1.0.0
```

或在 GitHub 网页上创建 Release：
1. 进入仓库页面 → Releases → Create a new release
2. 输入 Tag 版本（如 `v1.0.0`）
3. 填写 Release 标题和说明
4. 点击 Publish release

### 2. 触发 JitPack 构建
1. 访问 https://jitpack.io
2. 输入仓库地址：`github.com/你的用户名/CPBase`
3. 点击 "Look up"
4. 找到刚创建的版本，点击 "Get it"
5. 等待构建完成（绿色表示成功）

### 3. 验证构建日志
如果构建失败，点击日志图标查看详细错误信息。

## 使用方式

在其他项目中引用：

```kotlin
// settings.gradle.kts
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}

// build.gradle.kts
dependencies {
    implementation("com.github.你的用户名.CPBase:cpbase:v1.0.0")
    implementation("com.github.你的用户名.CPBase:cpcomm:v1.0.0")
}
```

## 版本更新

更新 AAR 后发布新版本：
1. 替换 `cpbase/libs/` 或 `cpcomm/libs/` 中的 AAR 文件
2. 修改对应 `build.gradle.kts` 中的 version
3. 提交更改并创建新 Tag（如 `v1.0.1`）
4. 推送 Tag 触发 JitPack 构建
