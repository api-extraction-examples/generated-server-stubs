/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Removes alternate video sources.
*
* itemId UUID The item id.
* no response value expected for this operation
* */
const deleteAlternateSources = ({ itemId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Gets additional parts for a video.
*
* itemId UUID The item id.
* userId UUID Optional. Filter by user id, and attach user data. (optional)
* returns BaseItemDtoQueryResult
* */
const getAdditionalPart = ({ itemId, userId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        userId,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Gets a video stream.
*
* itemId UUID The item id.
* container String The video container. Possible values are: ts, webm, asf, wmv, ogv, mp4, m4v, mkv, mpeg, mpg, avi, 3gp, wmv, wtv, m2ts, mov, iso, flv. (optional)
* static Boolean Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false. (optional)
* params String The streaming parameters. (optional)
* tag String The tag. (optional)
* deviceProfileId String Optional. The dlna device profile id to utilize. (optional)
* playSessionId String The play session id. (optional)
* segmentContainer String The segment container. (optional)
* segmentLength Integer The segment length. (optional)
* minSegments Integer The minimum number of segments. (optional)
* mediaSourceId String The media version id, if playing an alternate version. (optional)
* deviceId String The device id of the client requesting. Used to stop encoding processes when needed. (optional)
* audioCodec String Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url's extension. Options: aac, mp3, vorbis, wma. (optional)
* enableAutoStreamCopy Boolean Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
* allowVideoStreamCopy Boolean Whether or not to allow copying of the video stream url. (optional)
* allowAudioStreamCopy Boolean Whether or not to allow copying of the audio stream url. (optional)
* breakOnNonKeyFrames Boolean Optional. Whether to break on non key frames. (optional)
* audioSampleRate Integer Optional. Specify a specific audio sample rate, e.g. 44100. (optional)
* maxAudioBitDepth Integer Optional. The maximum audio bit depth. (optional)
* audioBitRate Integer Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
* audioChannels Integer Optional. Specify a specific number of audio channels to encode to, e.g. 2. (optional)
* maxAudioChannels Integer Optional. Specify a maximum number of audio channels to encode to, e.g. 2. (optional)
* profile String Optional. Specify a specific an encoder profile (varies by encoder), e.g. main, baseline, high. (optional)
* level String Optional. Specify a level for the encoder profile (varies by encoder), e.g. 3, 3.1. (optional)
* framerate Float Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)
* maxFramerate Float Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)
* copyTimestamps Boolean Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
* startTimeTicks Long Optional. Specify a starting offset, in ticks. 1 tick = 10000 ms. (optional)
* width Integer Optional. The fixed horizontal resolution of the encoded video. (optional)
* height Integer Optional. The fixed vertical resolution of the encoded video. (optional)
* videoBitRate Integer Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
* subtitleStreamIndex Integer Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
* subtitleMethod SubtitleDeliveryMethod Optional. Specify the subtitle delivery method. (optional)
* maxRefFrames Integer Optional. (optional)
* maxVideoBitDepth Integer Optional. The maximum video bit depth. (optional)
* requireAvc Boolean Optional. Whether to require avc. (optional)
* deInterlace Boolean Optional. Whether to deinterlace the video. (optional)
* requireNonAnamorphic Boolean Optional. Whether to require a non anamorphic stream. (optional)
* transcodingMaxAudioChannels Integer Optional. The maximum number of audio channels to transcode. (optional)
* cpuCoreLimit Integer Optional. The limit of how many cpu cores to use. (optional)
* liveStreamId String The live stream id. (optional)
* enableMpegtsM2TsMode Boolean Optional. Whether to enable the MpegtsM2Ts mode. (optional)
* videoCodec String Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url's extension. Options: h265, h264, mpeg4, theora, vpx, wmv. (optional)
* subtitleCodec String Optional. Specify a subtitle codec to encode to. (optional)
* transcodeReasons String Optional. The transcoding reason. (optional)
* audioStreamIndex Integer Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
* videoStreamIndex Integer Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
* context EncodingContext Optional. The MediaBrowser.Model.Dlna.EncodingContext. (optional)
* streamOptions Map Optional. The streaming options. (optional)
* returns File
* */
const getVideoStream = ({ itemId, container, static, params, tag, deviceProfileId, playSessionId, segmentContainer, segmentLength, minSegments, mediaSourceId, deviceId, audioCodec, enableAutoStreamCopy, allowVideoStreamCopy, allowAudioStreamCopy, breakOnNonKeyFrames, audioSampleRate, maxAudioBitDepth, audioBitRate, audioChannels, maxAudioChannels, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, requireAvc, deInterlace, requireNonAnamorphic, transcodingMaxAudioChannels, cpuCoreLimit, liveStreamId, enableMpegtsM2TsMode, videoCodec, subtitleCodec, transcodeReasons, audioStreamIndex, videoStreamIndex, context, streamOptions }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        container,
        static,
        params,
        tag,
        deviceProfileId,
        playSessionId,
        segmentContainer,
        segmentLength,
        minSegments,
        mediaSourceId,
        deviceId,
        audioCodec,
        enableAutoStreamCopy,
        allowVideoStreamCopy,
        allowAudioStreamCopy,
        breakOnNonKeyFrames,
        audioSampleRate,
        maxAudioBitDepth,
        audioBitRate,
        audioChannels,
        maxAudioChannels,
        profile,
        level,
        framerate,
        maxFramerate,
        copyTimestamps,
        startTimeTicks,
        width,
        height,
        videoBitRate,
        subtitleStreamIndex,
        subtitleMethod,
        maxRefFrames,
        maxVideoBitDepth,
        requireAvc,
        deInterlace,
        requireNonAnamorphic,
        transcodingMaxAudioChannels,
        cpuCoreLimit,
        liveStreamId,
        enableMpegtsM2TsMode,
        videoCodec,
        subtitleCodec,
        transcodeReasons,
        audioStreamIndex,
        videoStreamIndex,
        context,
        streamOptions,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Gets a video stream.
*
* itemId UUID The item id.
* container String The video container. Possible values are: ts, webm, asf, wmv, ogv, mp4, m4v, mkv, mpeg, mpg, avi, 3gp, wmv, wtv, m2ts, mov, iso, flv.
* stream String 
* static Boolean Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false. (optional)
* params String The streaming parameters. (optional)
* tag String The tag. (optional)
* deviceProfileId String Optional. The dlna device profile id to utilize. (optional)
* playSessionId String The play session id. (optional)
* segmentContainer String The segment container. (optional)
* segmentLength Integer The segment lenght. (optional)
* minSegments Integer The minimum number of segments. (optional)
* mediaSourceId String The media version id, if playing an alternate version. (optional)
* deviceId String The device id of the client requesting. Used to stop encoding processes when needed. (optional)
* audioCodec String Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url's extension. Options: aac, mp3, vorbis, wma. (optional)
* enableAutoStreamCopy Boolean Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
* allowVideoStreamCopy Boolean Whether or not to allow copying of the video stream url. (optional)
* allowAudioStreamCopy Boolean Whether or not to allow copying of the audio stream url. (optional)
* breakOnNonKeyFrames Boolean Optional. Whether to break on non key frames. (optional)
* audioSampleRate Integer Optional. Specify a specific audio sample rate, e.g. 44100. (optional)
* maxAudioBitDepth Integer Optional. The maximum audio bit depth. (optional)
* audioBitRate Integer Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
* audioChannels Integer Optional. Specify a specific number of audio channels to encode to, e.g. 2. (optional)
* maxAudioChannels Integer Optional. Specify a maximum number of audio channels to encode to, e.g. 2. (optional)
* profile String Optional. Specify a specific an encoder profile (varies by encoder), e.g. main, baseline, high. (optional)
* level String Optional. Specify a level for the encoder profile (varies by encoder), e.g. 3, 3.1. (optional)
* framerate Float Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)
* maxFramerate Float Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)
* copyTimestamps Boolean Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
* startTimeTicks Long Optional. Specify a starting offset, in ticks. 1 tick = 10000 ms. (optional)
* width Integer Optional. The fixed horizontal resolution of the encoded video. (optional)
* height Integer Optional. The fixed vertical resolution of the encoded video. (optional)
* videoBitRate Integer Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
* subtitleStreamIndex Integer Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
* subtitleMethod SubtitleDeliveryMethod Optional. Specify the subtitle delivery method. (optional)
* maxRefFrames Integer Optional. (optional)
* maxVideoBitDepth Integer Optional. The maximum video bit depth. (optional)
* requireAvc Boolean Optional. Whether to require avc. (optional)
* deInterlace Boolean Optional. Whether to deinterlace the video. (optional)
* requireNonAnamorphic Boolean Optional. Whether to require a non anamporphic stream. (optional)
* transcodingMaxAudioChannels Integer Optional. The maximum number of audio channels to transcode. (optional)
* cpuCoreLimit Integer Optional. The limit of how many cpu cores to use. (optional)
* liveStreamId String The live stream id. (optional)
* enableMpegtsM2TsMode Boolean Optional. Whether to enable the MpegtsM2Ts mode. (optional)
* videoCodec String Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url's extension. Options: h265, h264, mpeg4, theora, vpx, wmv. (optional)
* subtitleCodec String Optional. Specify a subtitle codec to encode to. (optional)
* transcodeReasons String Optional. The transcoding reason. (optional)
* audioStreamIndex Integer Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
* videoStreamIndex Integer Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
* context EncodingContext Optional. The MediaBrowser.Model.Dlna.EncodingContext. (optional)
* streamOptions Map Optional. The streaming options. (optional)
* returns File
* */
const getVideoStreamByContainer = ({ itemId, container, stream, static, params, tag, deviceProfileId, playSessionId, segmentContainer, segmentLength, minSegments, mediaSourceId, deviceId, audioCodec, enableAutoStreamCopy, allowVideoStreamCopy, allowAudioStreamCopy, breakOnNonKeyFrames, audioSampleRate, maxAudioBitDepth, audioBitRate, audioChannels, maxAudioChannels, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, requireAvc, deInterlace, requireNonAnamorphic, transcodingMaxAudioChannels, cpuCoreLimit, liveStreamId, enableMpegtsM2TsMode, videoCodec, subtitleCodec, transcodeReasons, audioStreamIndex, videoStreamIndex, context, streamOptions }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        container,
        stream,
        static,
        params,
        tag,
        deviceProfileId,
        playSessionId,
        segmentContainer,
        segmentLength,
        minSegments,
        mediaSourceId,
        deviceId,
        audioCodec,
        enableAutoStreamCopy,
        allowVideoStreamCopy,
        allowAudioStreamCopy,
        breakOnNonKeyFrames,
        audioSampleRate,
        maxAudioBitDepth,
        audioBitRate,
        audioChannels,
        maxAudioChannels,
        profile,
        level,
        framerate,
        maxFramerate,
        copyTimestamps,
        startTimeTicks,
        width,
        height,
        videoBitRate,
        subtitleStreamIndex,
        subtitleMethod,
        maxRefFrames,
        maxVideoBitDepth,
        requireAvc,
        deInterlace,
        requireNonAnamorphic,
        transcodingMaxAudioChannels,
        cpuCoreLimit,
        liveStreamId,
        enableMpegtsM2TsMode,
        videoCodec,
        subtitleCodec,
        transcodeReasons,
        audioStreamIndex,
        videoStreamIndex,
        context,
        streamOptions,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Gets a video stream.
*
* itemId UUID The item id.
* container String The video container. Possible values are: ts, webm, asf, wmv, ogv, mp4, m4v, mkv, mpeg, mpg, avi, 3gp, wmv, wtv, m2ts, mov, iso, flv. (optional)
* static Boolean Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false. (optional)
* params String The streaming parameters. (optional)
* tag String The tag. (optional)
* deviceProfileId String Optional. The dlna device profile id to utilize. (optional)
* playSessionId String The play session id. (optional)
* segmentContainer String The segment container. (optional)
* segmentLength Integer The segment length. (optional)
* minSegments Integer The minimum number of segments. (optional)
* mediaSourceId String The media version id, if playing an alternate version. (optional)
* deviceId String The device id of the client requesting. Used to stop encoding processes when needed. (optional)
* audioCodec String Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url's extension. Options: aac, mp3, vorbis, wma. (optional)
* enableAutoStreamCopy Boolean Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
* allowVideoStreamCopy Boolean Whether or not to allow copying of the video stream url. (optional)
* allowAudioStreamCopy Boolean Whether or not to allow copying of the audio stream url. (optional)
* breakOnNonKeyFrames Boolean Optional. Whether to break on non key frames. (optional)
* audioSampleRate Integer Optional. Specify a specific audio sample rate, e.g. 44100. (optional)
* maxAudioBitDepth Integer Optional. The maximum audio bit depth. (optional)
* audioBitRate Integer Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
* audioChannels Integer Optional. Specify a specific number of audio channels to encode to, e.g. 2. (optional)
* maxAudioChannels Integer Optional. Specify a maximum number of audio channels to encode to, e.g. 2. (optional)
* profile String Optional. Specify a specific an encoder profile (varies by encoder), e.g. main, baseline, high. (optional)
* level String Optional. Specify a level for the encoder profile (varies by encoder), e.g. 3, 3.1. (optional)
* framerate Float Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)
* maxFramerate Float Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)
* copyTimestamps Boolean Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
* startTimeTicks Long Optional. Specify a starting offset, in ticks. 1 tick = 10000 ms. (optional)
* width Integer Optional. The fixed horizontal resolution of the encoded video. (optional)
* height Integer Optional. The fixed vertical resolution of the encoded video. (optional)
* videoBitRate Integer Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
* subtitleStreamIndex Integer Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
* subtitleMethod SubtitleDeliveryMethod Optional. Specify the subtitle delivery method. (optional)
* maxRefFrames Integer Optional. (optional)
* maxVideoBitDepth Integer Optional. The maximum video bit depth. (optional)
* requireAvc Boolean Optional. Whether to require avc. (optional)
* deInterlace Boolean Optional. Whether to deinterlace the video. (optional)
* requireNonAnamorphic Boolean Optional. Whether to require a non anamorphic stream. (optional)
* transcodingMaxAudioChannels Integer Optional. The maximum number of audio channels to transcode. (optional)
* cpuCoreLimit Integer Optional. The limit of how many cpu cores to use. (optional)
* liveStreamId String The live stream id. (optional)
* enableMpegtsM2TsMode Boolean Optional. Whether to enable the MpegtsM2Ts mode. (optional)
* videoCodec String Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url's extension. Options: h265, h264, mpeg4, theora, vpx, wmv. (optional)
* subtitleCodec String Optional. Specify a subtitle codec to encode to. (optional)
* transcodeReasons String Optional. The transcoding reason. (optional)
* audioStreamIndex Integer Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
* videoStreamIndex Integer Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
* context EncodingContext Optional. The MediaBrowser.Model.Dlna.EncodingContext. (optional)
* streamOptions Map Optional. The streaming options. (optional)
* returns File
* */
const headVideoStream = ({ itemId, container, static, params, tag, deviceProfileId, playSessionId, segmentContainer, segmentLength, minSegments, mediaSourceId, deviceId, audioCodec, enableAutoStreamCopy, allowVideoStreamCopy, allowAudioStreamCopy, breakOnNonKeyFrames, audioSampleRate, maxAudioBitDepth, audioBitRate, audioChannels, maxAudioChannels, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, requireAvc, deInterlace, requireNonAnamorphic, transcodingMaxAudioChannels, cpuCoreLimit, liveStreamId, enableMpegtsM2TsMode, videoCodec, subtitleCodec, transcodeReasons, audioStreamIndex, videoStreamIndex, context, streamOptions }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        container,
        static,
        params,
        tag,
        deviceProfileId,
        playSessionId,
        segmentContainer,
        segmentLength,
        minSegments,
        mediaSourceId,
        deviceId,
        audioCodec,
        enableAutoStreamCopy,
        allowVideoStreamCopy,
        allowAudioStreamCopy,
        breakOnNonKeyFrames,
        audioSampleRate,
        maxAudioBitDepth,
        audioBitRate,
        audioChannels,
        maxAudioChannels,
        profile,
        level,
        framerate,
        maxFramerate,
        copyTimestamps,
        startTimeTicks,
        width,
        height,
        videoBitRate,
        subtitleStreamIndex,
        subtitleMethod,
        maxRefFrames,
        maxVideoBitDepth,
        requireAvc,
        deInterlace,
        requireNonAnamorphic,
        transcodingMaxAudioChannels,
        cpuCoreLimit,
        liveStreamId,
        enableMpegtsM2TsMode,
        videoCodec,
        subtitleCodec,
        transcodeReasons,
        audioStreamIndex,
        videoStreamIndex,
        context,
        streamOptions,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Gets a video stream.
*
* itemId UUID The item id.
* container String The video container. Possible values are: ts, webm, asf, wmv, ogv, mp4, m4v, mkv, mpeg, mpg, avi, 3gp, wmv, wtv, m2ts, mov, iso, flv.
* stream String 
* static Boolean Optional. If true, the original file will be streamed statically without any encoding. Use either no url extension or the original file extension. true/false. (optional)
* params String The streaming parameters. (optional)
* tag String The tag. (optional)
* deviceProfileId String Optional. The dlna device profile id to utilize. (optional)
* playSessionId String The play session id. (optional)
* segmentContainer String The segment container. (optional)
* segmentLength Integer The segment lenght. (optional)
* minSegments Integer The minimum number of segments. (optional)
* mediaSourceId String The media version id, if playing an alternate version. (optional)
* deviceId String The device id of the client requesting. Used to stop encoding processes when needed. (optional)
* audioCodec String Optional. Specify a audio codec to encode to, e.g. mp3. If omitted the server will auto-select using the url's extension. Options: aac, mp3, vorbis, wma. (optional)
* enableAutoStreamCopy Boolean Whether or not to allow automatic stream copy if requested values match the original source. Defaults to true. (optional)
* allowVideoStreamCopy Boolean Whether or not to allow copying of the video stream url. (optional)
* allowAudioStreamCopy Boolean Whether or not to allow copying of the audio stream url. (optional)
* breakOnNonKeyFrames Boolean Optional. Whether to break on non key frames. (optional)
* audioSampleRate Integer Optional. Specify a specific audio sample rate, e.g. 44100. (optional)
* maxAudioBitDepth Integer Optional. The maximum audio bit depth. (optional)
* audioBitRate Integer Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
* audioChannels Integer Optional. Specify a specific number of audio channels to encode to, e.g. 2. (optional)
* maxAudioChannels Integer Optional. Specify a maximum number of audio channels to encode to, e.g. 2. (optional)
* profile String Optional. Specify a specific an encoder profile (varies by encoder), e.g. main, baseline, high. (optional)
* level String Optional. Specify a level for the encoder profile (varies by encoder), e.g. 3, 3.1. (optional)
* framerate Float Optional. A specific video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)
* maxFramerate Float Optional. A specific maximum video framerate to encode to, e.g. 23.976. Generally this should be omitted unless the device has specific requirements. (optional)
* copyTimestamps Boolean Whether or not to copy timestamps when transcoding with an offset. Defaults to false. (optional)
* startTimeTicks Long Optional. Specify a starting offset, in ticks. 1 tick = 10000 ms. (optional)
* width Integer Optional. The fixed horizontal resolution of the encoded video. (optional)
* height Integer Optional. The fixed vertical resolution of the encoded video. (optional)
* videoBitRate Integer Optional. Specify a video bitrate to encode to, e.g. 500000. If omitted this will be left to encoder defaults. (optional)
* subtitleStreamIndex Integer Optional. The index of the subtitle stream to use. If omitted no subtitles will be used. (optional)
* subtitleMethod SubtitleDeliveryMethod Optional. Specify the subtitle delivery method. (optional)
* maxRefFrames Integer Optional. (optional)
* maxVideoBitDepth Integer Optional. The maximum video bit depth. (optional)
* requireAvc Boolean Optional. Whether to require avc. (optional)
* deInterlace Boolean Optional. Whether to deinterlace the video. (optional)
* requireNonAnamorphic Boolean Optional. Whether to require a non anamporphic stream. (optional)
* transcodingMaxAudioChannels Integer Optional. The maximum number of audio channels to transcode. (optional)
* cpuCoreLimit Integer Optional. The limit of how many cpu cores to use. (optional)
* liveStreamId String The live stream id. (optional)
* enableMpegtsM2TsMode Boolean Optional. Whether to enable the MpegtsM2Ts mode. (optional)
* videoCodec String Optional. Specify a video codec to encode to, e.g. h264. If omitted the server will auto-select using the url's extension. Options: h265, h264, mpeg4, theora, vpx, wmv. (optional)
* subtitleCodec String Optional. Specify a subtitle codec to encode to. (optional)
* transcodeReasons String Optional. The transcoding reason. (optional)
* audioStreamIndex Integer Optional. The index of the audio stream to use. If omitted the first audio stream will be used. (optional)
* videoStreamIndex Integer Optional. The index of the video stream to use. If omitted the first video stream will be used. (optional)
* context EncodingContext Optional. The MediaBrowser.Model.Dlna.EncodingContext. (optional)
* streamOptions Map Optional. The streaming options. (optional)
* returns File
* */
const headVideoStreamByContainer = ({ itemId, container, stream, static, params, tag, deviceProfileId, playSessionId, segmentContainer, segmentLength, minSegments, mediaSourceId, deviceId, audioCodec, enableAutoStreamCopy, allowVideoStreamCopy, allowAudioStreamCopy, breakOnNonKeyFrames, audioSampleRate, maxAudioBitDepth, audioBitRate, audioChannels, maxAudioChannels, profile, level, framerate, maxFramerate, copyTimestamps, startTimeTicks, width, height, videoBitRate, subtitleStreamIndex, subtitleMethod, maxRefFrames, maxVideoBitDepth, requireAvc, deInterlace, requireNonAnamorphic, transcodingMaxAudioChannels, cpuCoreLimit, liveStreamId, enableMpegtsM2TsMode, videoCodec, subtitleCodec, transcodeReasons, audioStreamIndex, videoStreamIndex, context, streamOptions }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        container,
        stream,
        static,
        params,
        tag,
        deviceProfileId,
        playSessionId,
        segmentContainer,
        segmentLength,
        minSegments,
        mediaSourceId,
        deviceId,
        audioCodec,
        enableAutoStreamCopy,
        allowVideoStreamCopy,
        allowAudioStreamCopy,
        breakOnNonKeyFrames,
        audioSampleRate,
        maxAudioBitDepth,
        audioBitRate,
        audioChannels,
        maxAudioChannels,
        profile,
        level,
        framerate,
        maxFramerate,
        copyTimestamps,
        startTimeTicks,
        width,
        height,
        videoBitRate,
        subtitleStreamIndex,
        subtitleMethod,
        maxRefFrames,
        maxVideoBitDepth,
        requireAvc,
        deInterlace,
        requireNonAnamorphic,
        transcodingMaxAudioChannels,
        cpuCoreLimit,
        liveStreamId,
        enableMpegtsM2TsMode,
        videoCodec,
        subtitleCodec,
        transcodeReasons,
        audioStreamIndex,
        videoStreamIndex,
        context,
        streamOptions,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Merges videos into a single record.
*
* ids List Item id list. This allows multiple, comma delimited.
* no response value expected for this operation
* */
const mergeVersions = ({ ids }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        ids,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  deleteAlternateSources,
  getAdditionalPart,
  getVideoStream,
  getVideoStreamByContainer,
  headVideoStream,
  headVideoStreamByContainer,
  mergeVersions,
};
