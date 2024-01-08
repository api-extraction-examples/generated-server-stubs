from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ItemFields(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    AIRTIME = 'AirTime'
    CANDELETE = 'CanDelete'
    CANDOWNLOAD = 'CanDownload'
    CHANNELINFO = 'ChannelInfo'
    CHAPTERS = 'Chapters'
    CHILDCOUNT = 'ChildCount'
    CUMULATIVERUNTIMETICKS = 'CumulativeRunTimeTicks'
    CUSTOMRATING = 'CustomRating'
    DATECREATED = 'DateCreated'
    DATELASTMEDIAADDED = 'DateLastMediaAdded'
    DISPLAYPREFERENCESID = 'DisplayPreferencesId'
    ETAG = 'Etag'
    EXTERNALURLS = 'ExternalUrls'
    GENRES = 'Genres'
    HOMEPAGEURL = 'HomePageUrl'
    ITEMCOUNTS = 'ItemCounts'
    MEDIASOURCECOUNT = 'MediaSourceCount'
    MEDIASOURCES = 'MediaSources'
    ORIGINALTITLE = 'OriginalTitle'
    OVERVIEW = 'Overview'
    PARENTID = 'ParentId'
    PATH = 'Path'
    PEOPLE = 'People'
    PLAYACCESS = 'PlayAccess'
    PRODUCTIONLOCATIONS = 'ProductionLocations'
    PROVIDERIDS = 'ProviderIds'
    PRIMARYIMAGEASPECTRATIO = 'PrimaryImageAspectRatio'
    RECURSIVEITEMCOUNT = 'RecursiveItemCount'
    SETTINGS = 'Settings'
    SCREENSHOTIMAGETAGS = 'ScreenshotImageTags'
    SERIESPRIMARYIMAGE = 'SeriesPrimaryImage'
    SERIESSTUDIO = 'SeriesStudio'
    SORTNAME = 'SortName'
    SPECIALEPISODENUMBERS = 'SpecialEpisodeNumbers'
    STUDIOS = 'Studios'
    BASICSYNCINFO = 'BasicSyncInfo'
    SYNCINFO = 'SyncInfo'
    TAGLINES = 'Taglines'
    TAGS = 'Tags'
    REMOTETRAILERS = 'RemoteTrailers'
    MEDIASTREAMS = 'MediaStreams'
    SEASONUSERDATA = 'SeasonUserData'
    SERVICENAME = 'ServiceName'
    THEMESONGIDS = 'ThemeSongIds'
    THEMEVIDEOIDS = 'ThemeVideoIds'
    EXTERNALETAG = 'ExternalEtag'
    PRESENTATIONUNIQUEKEY = 'PresentationUniqueKey'
    INHERITEDPARENTALRATINGVALUE = 'InheritedParentalRatingValue'
    EXTERNALSERIESID = 'ExternalSeriesId'
    SERIESPRESENTATIONUNIQUEKEY = 'SeriesPresentationUniqueKey'
    DATELASTREFRESHED = 'DateLastRefreshed'
    DATELASTSAVED = 'DateLastSaved'
    REFRESHSTATE = 'RefreshState'
    CHANNELIMAGE = 'ChannelImage'
    ENABLEMEDIASOURCEDISPLAY = 'EnableMediaSourceDisplay'
    WIDTH = 'Width'
    HEIGHT = 'Height'
    EXTRAIDS = 'ExtraIds'
    LOCALTRAILERCOUNT = 'LocalTrailerCount'
    ISHD = 'IsHD'
    SPECIALFEATURECOUNT = 'SpecialFeatureCount'
    def __init__(self):  # noqa: E501
        """ItemFields - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'ItemFields':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ItemFields of this ItemFields.  # noqa: E501
        :rtype: ItemFields
        """
        return util.deserialize_model(dikt, cls)
