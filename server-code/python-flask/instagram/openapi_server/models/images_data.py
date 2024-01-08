from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.image_info import ImageInfo
from openapi_server import util

from openapi_server.models.image_info import ImageInfo  # noqa: E501

class ImagesData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, low_resolution=None, standard_resolution=None, thumbnail=None):  # noqa: E501
        """ImagesData - a model defined in OpenAPI

        :param low_resolution: The low_resolution of this ImagesData.  # noqa: E501
        :type low_resolution: ImageInfo
        :param standard_resolution: The standard_resolution of this ImagesData.  # noqa: E501
        :type standard_resolution: ImageInfo
        :param thumbnail: The thumbnail of this ImagesData.  # noqa: E501
        :type thumbnail: ImageInfo
        """
        self.openapi_types = {
            'low_resolution': ImageInfo,
            'standard_resolution': ImageInfo,
            'thumbnail': ImageInfo
        }

        self.attribute_map = {
            'low_resolution': 'low_resolution',
            'standard_resolution': 'standard_resolution',
            'thumbnail': 'thumbnail'
        }

        self._low_resolution = low_resolution
        self._standard_resolution = standard_resolution
        self._thumbnail = thumbnail

    @classmethod
    def from_dict(cls, dikt) -> 'ImagesData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ImagesData of this ImagesData.  # noqa: E501
        :rtype: ImagesData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def low_resolution(self) -> ImageInfo:
        """Gets the low_resolution of this ImagesData.


        :return: The low_resolution of this ImagesData.
        :rtype: ImageInfo
        """
        return self._low_resolution

    @low_resolution.setter
    def low_resolution(self, low_resolution: ImageInfo):
        """Sets the low_resolution of this ImagesData.


        :param low_resolution: The low_resolution of this ImagesData.
        :type low_resolution: ImageInfo
        """

        self._low_resolution = low_resolution

    @property
    def standard_resolution(self) -> ImageInfo:
        """Gets the standard_resolution of this ImagesData.


        :return: The standard_resolution of this ImagesData.
        :rtype: ImageInfo
        """
        return self._standard_resolution

    @standard_resolution.setter
    def standard_resolution(self, standard_resolution: ImageInfo):
        """Sets the standard_resolution of this ImagesData.


        :param standard_resolution: The standard_resolution of this ImagesData.
        :type standard_resolution: ImageInfo
        """

        self._standard_resolution = standard_resolution

    @property
    def thumbnail(self) -> ImageInfo:
        """Gets the thumbnail of this ImagesData.


        :return: The thumbnail of this ImagesData.
        :rtype: ImageInfo
        """
        return self._thumbnail

    @thumbnail.setter
    def thumbnail(self, thumbnail: ImageInfo):
        """Sets the thumbnail of this ImagesData.


        :param thumbnail: The thumbnail of this ImagesData.
        :type thumbnail: ImageInfo
        """

        self._thumbnail = thumbnail