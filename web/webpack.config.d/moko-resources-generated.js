const path = require('path');

const mokoResourcePath = path.resolve("D:/Programming/Android/Apps/My Apps/Sketchable/web/build/generated/moko/jsMain/comwakaztahirsketchapp/res");

config.module.rules.push(
    {
        test: /\.(.*)/,
        include: [
            path.resolve(mokoResourcePath)
        ],
        type: 'asset/resource'
    }
);

config.module.rules.push(
    {
        test: /\.(otf|ttf)?$/,
        use: [
            {
                loader: 'file-loader',
                options: {
                    name: '[name].[ext]',
                    outputPath: 'fonts/'
                }
            }
        ]
    }
)

config.resolve.modules.push(
    path.resolve(mokoResourcePath)
);