from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ImageMetadata(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, last_tag_time=None):  # noqa: E501
        """ImageMetadata - a model defined in OpenAPI

        :param last_tag_time: The last_tag_time of this ImageMetadata.  # noqa: E501
        :type last_tag_time: str
        """
        self.openapi_types = {
            'last_tag_time': str
        }

        self.attribute_map = {
            'last_tag_time': 'LastTagTime'
        }

        self._last_tag_time = last_tag_time

    @classmethod
    def from_dict(cls, dikt) -> 'ImageMetadata':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Image_Metadata of this ImageMetadata.  # noqa: E501
        :rtype: ImageMetadata
        """
        return util.deserialize_model(dikt, cls)

    @property
    def last_tag_time(self) -> str:
        """Gets the last_tag_time of this ImageMetadata.


        :return: The last_tag_time of this ImageMetadata.
        :rtype: str
        """
        return self._last_tag_time

    @last_tag_time.setter
    def last_tag_time(self, last_tag_time: str):
        """Sets the last_tag_time of this ImageMetadata.


        :param last_tag_time: The last_tag_time of this ImageMetadata.
        :type last_tag_time: str
        """

        self._last_tag_time = last_tag_time
