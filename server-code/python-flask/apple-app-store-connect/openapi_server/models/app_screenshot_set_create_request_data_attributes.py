from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.screenshot_display_type import ScreenshotDisplayType
from openapi_server import util

from openapi_server.models.screenshot_display_type import ScreenshotDisplayType  # noqa: E501

class AppScreenshotSetCreateRequestDataAttributes(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, screenshot_display_type=None):  # noqa: E501
        """AppScreenshotSetCreateRequestDataAttributes - a model defined in OpenAPI

        :param screenshot_display_type: The screenshot_display_type of this AppScreenshotSetCreateRequestDataAttributes.  # noqa: E501
        :type screenshot_display_type: ScreenshotDisplayType
        """
        self.openapi_types = {
            'screenshot_display_type': ScreenshotDisplayType
        }

        self.attribute_map = {
            'screenshot_display_type': 'screenshotDisplayType'
        }

        self._screenshot_display_type = screenshot_display_type

    @classmethod
    def from_dict(cls, dikt) -> 'AppScreenshotSetCreateRequestDataAttributes':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppScreenshotSetCreateRequest_data_attributes of this AppScreenshotSetCreateRequestDataAttributes.  # noqa: E501
        :rtype: AppScreenshotSetCreateRequestDataAttributes
        """
        return util.deserialize_model(dikt, cls)

    @property
    def screenshot_display_type(self) -> ScreenshotDisplayType:
        """Gets the screenshot_display_type of this AppScreenshotSetCreateRequestDataAttributes.


        :return: The screenshot_display_type of this AppScreenshotSetCreateRequestDataAttributes.
        :rtype: ScreenshotDisplayType
        """
        return self._screenshot_display_type

    @screenshot_display_type.setter
    def screenshot_display_type(self, screenshot_display_type: ScreenshotDisplayType):
        """Sets the screenshot_display_type of this AppScreenshotSetCreateRequestDataAttributes.


        :param screenshot_display_type: The screenshot_display_type of this AppScreenshotSetCreateRequestDataAttributes.
        :type screenshot_display_type: ScreenshotDisplayType
        """
        if screenshot_display_type is None:
            raise ValueError("Invalid value for `screenshot_display_type`, must not be `None`")  # noqa: E501

        self._screenshot_display_type = screenshot_display_type
