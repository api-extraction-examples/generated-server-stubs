from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class UserBaseResponseAllOfPhoto(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, image_1024x1024=None, image_128x128=None, image_21x21=None, image_27x27=None, image_36x36=None, image_60x60=None):  # noqa: E501
        """UserBaseResponseAllOfPhoto - a model defined in OpenAPI

        :param image_1024x1024: The image_1024x1024 of this UserBaseResponseAllOfPhoto.  # noqa: E501
        :type image_1024x1024: str
        :param image_128x128: The image_128x128 of this UserBaseResponseAllOfPhoto.  # noqa: E501
        :type image_128x128: str
        :param image_21x21: The image_21x21 of this UserBaseResponseAllOfPhoto.  # noqa: E501
        :type image_21x21: str
        :param image_27x27: The image_27x27 of this UserBaseResponseAllOfPhoto.  # noqa: E501
        :type image_27x27: str
        :param image_36x36: The image_36x36 of this UserBaseResponseAllOfPhoto.  # noqa: E501
        :type image_36x36: str
        :param image_60x60: The image_60x60 of this UserBaseResponseAllOfPhoto.  # noqa: E501
        :type image_60x60: str
        """
        self.openapi_types = {
            'image_1024x1024': str,
            'image_128x128': str,
            'image_21x21': str,
            'image_27x27': str,
            'image_36x36': str,
            'image_60x60': str
        }

        self.attribute_map = {
            'image_1024x1024': 'image_1024x1024',
            'image_128x128': 'image_128x128',
            'image_21x21': 'image_21x21',
            'image_27x27': 'image_27x27',
            'image_36x36': 'image_36x36',
            'image_60x60': 'image_60x60'
        }

        self._image_1024x1024 = image_1024x1024
        self._image_128x128 = image_128x128
        self._image_21x21 = image_21x21
        self._image_27x27 = image_27x27
        self._image_36x36 = image_36x36
        self._image_60x60 = image_60x60

    @classmethod
    def from_dict(cls, dikt) -> 'UserBaseResponseAllOfPhoto':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UserBaseResponse_allOf_photo of this UserBaseResponseAllOfPhoto.  # noqa: E501
        :rtype: UserBaseResponseAllOfPhoto
        """
        return util.deserialize_model(dikt, cls)

    @property
    def image_1024x1024(self) -> str:
        """Gets the image_1024x1024 of this UserBaseResponseAllOfPhoto.


        :return: The image_1024x1024 of this UserBaseResponseAllOfPhoto.
        :rtype: str
        """
        return self._image_1024x1024

    @image_1024x1024.setter
    def image_1024x1024(self, image_1024x1024: str):
        """Sets the image_1024x1024 of this UserBaseResponseAllOfPhoto.


        :param image_1024x1024: The image_1024x1024 of this UserBaseResponseAllOfPhoto.
        :type image_1024x1024: str
        """

        self._image_1024x1024 = image_1024x1024

    @property
    def image_128x128(self) -> str:
        """Gets the image_128x128 of this UserBaseResponseAllOfPhoto.


        :return: The image_128x128 of this UserBaseResponseAllOfPhoto.
        :rtype: str
        """
        return self._image_128x128

    @image_128x128.setter
    def image_128x128(self, image_128x128: str):
        """Sets the image_128x128 of this UserBaseResponseAllOfPhoto.


        :param image_128x128: The image_128x128 of this UserBaseResponseAllOfPhoto.
        :type image_128x128: str
        """

        self._image_128x128 = image_128x128

    @property
    def image_21x21(self) -> str:
        """Gets the image_21x21 of this UserBaseResponseAllOfPhoto.


        :return: The image_21x21 of this UserBaseResponseAllOfPhoto.
        :rtype: str
        """
        return self._image_21x21

    @image_21x21.setter
    def image_21x21(self, image_21x21: str):
        """Sets the image_21x21 of this UserBaseResponseAllOfPhoto.


        :param image_21x21: The image_21x21 of this UserBaseResponseAllOfPhoto.
        :type image_21x21: str
        """

        self._image_21x21 = image_21x21

    @property
    def image_27x27(self) -> str:
        """Gets the image_27x27 of this UserBaseResponseAllOfPhoto.


        :return: The image_27x27 of this UserBaseResponseAllOfPhoto.
        :rtype: str
        """
        return self._image_27x27

    @image_27x27.setter
    def image_27x27(self, image_27x27: str):
        """Sets the image_27x27 of this UserBaseResponseAllOfPhoto.


        :param image_27x27: The image_27x27 of this UserBaseResponseAllOfPhoto.
        :type image_27x27: str
        """

        self._image_27x27 = image_27x27

    @property
    def image_36x36(self) -> str:
        """Gets the image_36x36 of this UserBaseResponseAllOfPhoto.


        :return: The image_36x36 of this UserBaseResponseAllOfPhoto.
        :rtype: str
        """
        return self._image_36x36

    @image_36x36.setter
    def image_36x36(self, image_36x36: str):
        """Sets the image_36x36 of this UserBaseResponseAllOfPhoto.


        :param image_36x36: The image_36x36 of this UserBaseResponseAllOfPhoto.
        :type image_36x36: str
        """

        self._image_36x36 = image_36x36

    @property
    def image_60x60(self) -> str:
        """Gets the image_60x60 of this UserBaseResponseAllOfPhoto.


        :return: The image_60x60 of this UserBaseResponseAllOfPhoto.
        :rtype: str
        """
        return self._image_60x60

    @image_60x60.setter
    def image_60x60(self, image_60x60: str):
        """Sets the image_60x60 of this UserBaseResponseAllOfPhoto.


        :param image_60x60: The image_60x60 of this UserBaseResponseAllOfPhoto.
        :type image_60x60: str
        """

        self._image_60x60 = image_60x60