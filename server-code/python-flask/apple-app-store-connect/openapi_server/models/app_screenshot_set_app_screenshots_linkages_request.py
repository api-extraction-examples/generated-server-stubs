from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_screenshot_set_relationships_app_screenshots_data_inner import AppScreenshotSetRelationshipsAppScreenshotsDataInner
from openapi_server import util

from openapi_server.models.app_screenshot_set_relationships_app_screenshots_data_inner import AppScreenshotSetRelationshipsAppScreenshotsDataInner  # noqa: E501

class AppScreenshotSetAppScreenshotsLinkagesRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """AppScreenshotSetAppScreenshotsLinkagesRequest - a model defined in OpenAPI

        :param data: The data of this AppScreenshotSetAppScreenshotsLinkagesRequest.  # noqa: E501
        :type data: List[AppScreenshotSetRelationshipsAppScreenshotsDataInner]
        """
        self.openapi_types = {
            'data': List[AppScreenshotSetRelationshipsAppScreenshotsDataInner]
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'AppScreenshotSetAppScreenshotsLinkagesRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppScreenshotSetAppScreenshotsLinkagesRequest of this AppScreenshotSetAppScreenshotsLinkagesRequest.  # noqa: E501
        :rtype: AppScreenshotSetAppScreenshotsLinkagesRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[AppScreenshotSetRelationshipsAppScreenshotsDataInner]:
        """Gets the data of this AppScreenshotSetAppScreenshotsLinkagesRequest.


        :return: The data of this AppScreenshotSetAppScreenshotsLinkagesRequest.
        :rtype: List[AppScreenshotSetRelationshipsAppScreenshotsDataInner]
        """
        return self._data

    @data.setter
    def data(self, data: List[AppScreenshotSetRelationshipsAppScreenshotsDataInner]):
        """Sets the data of this AppScreenshotSetAppScreenshotsLinkagesRequest.


        :param data: The data of this AppScreenshotSetAppScreenshotsLinkagesRequest.
        :type data: List[AppScreenshotSetRelationshipsAppScreenshotsDataInner]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data