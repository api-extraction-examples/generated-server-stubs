from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ScreenshotDisplayType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    APP_IPHONE_65 = 'APP_IPHONE_65'
    APP_IPHONE_58 = 'APP_IPHONE_58'
    APP_IPHONE_55 = 'APP_IPHONE_55'
    APP_IPHONE_47 = 'APP_IPHONE_47'
    APP_IPHONE_40 = 'APP_IPHONE_40'
    APP_IPHONE_35 = 'APP_IPHONE_35'
    APP_IPAD_PRO_3_GEN_129 = 'APP_IPAD_PRO_3GEN_129'
    APP_IPAD_PRO_3_GEN_11 = 'APP_IPAD_PRO_3GEN_11'
    APP_IPAD_PRO_129 = 'APP_IPAD_PRO_129'
    APP_IPAD_105 = 'APP_IPAD_105'
    APP_IPAD_97 = 'APP_IPAD_97'
    APP_DESKTOP = 'APP_DESKTOP'
    APP_WATCH_SERIES_4 = 'APP_WATCH_SERIES_4'
    APP_WATCH_SERIES_3 = 'APP_WATCH_SERIES_3'
    APP_APPLE_TV = 'APP_APPLE_TV'
    IMESSAGE_APP_IPHONE_65 = 'IMESSAGE_APP_IPHONE_65'
    IMESSAGE_APP_IPHONE_58 = 'IMESSAGE_APP_IPHONE_58'
    IMESSAGE_APP_IPHONE_55 = 'IMESSAGE_APP_IPHONE_55'
    IMESSAGE_APP_IPHONE_47 = 'IMESSAGE_APP_IPHONE_47'
    IMESSAGE_APP_IPHONE_40 = 'IMESSAGE_APP_IPHONE_40'
    IMESSAGE_APP_IPAD_PRO_3_GEN_129 = 'IMESSAGE_APP_IPAD_PRO_3GEN_129'
    IMESSAGE_APP_IPAD_PRO_3_GEN_11 = 'IMESSAGE_APP_IPAD_PRO_3GEN_11'
    IMESSAGE_APP_IPAD_PRO_129 = 'IMESSAGE_APP_IPAD_PRO_129'
    IMESSAGE_APP_IPAD_105 = 'IMESSAGE_APP_IPAD_105'
    IMESSAGE_APP_IPAD_97 = 'IMESSAGE_APP_IPAD_97'
    def __init__(self):  # noqa: E501
        """ScreenshotDisplayType - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'ScreenshotDisplayType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ScreenshotDisplayType of this ScreenshotDisplayType.  # noqa: E501
        :rtype: ScreenshotDisplayType
        """
        return util.deserialize_model(dikt, cls)
