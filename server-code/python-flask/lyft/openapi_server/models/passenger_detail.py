from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PassengerDetail(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, first_name=None, image_url=None, rating=None, last_name=None, user_id=None):  # noqa: E501
        """PassengerDetail - a model defined in OpenAPI

        :param first_name: The first_name of this PassengerDetail.  # noqa: E501
        :type first_name: str
        :param image_url: The image_url of this PassengerDetail.  # noqa: E501
        :type image_url: str
        :param rating: The rating of this PassengerDetail.  # noqa: E501
        :type rating: str
        :param last_name: The last_name of this PassengerDetail.  # noqa: E501
        :type last_name: str
        :param user_id: The user_id of this PassengerDetail.  # noqa: E501
        :type user_id: str
        """
        self.openapi_types = {
            'first_name': str,
            'image_url': str,
            'rating': str,
            'last_name': str,
            'user_id': str
        }

        self.attribute_map = {
            'first_name': 'first_name',
            'image_url': 'image_url',
            'rating': 'rating',
            'last_name': 'last_name',
            'user_id': 'user_id'
        }

        self._first_name = first_name
        self._image_url = image_url
        self._rating = rating
        self._last_name = last_name
        self._user_id = user_id

    @classmethod
    def from_dict(cls, dikt) -> 'PassengerDetail':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PassengerDetail of this PassengerDetail.  # noqa: E501
        :rtype: PassengerDetail
        """
        return util.deserialize_model(dikt, cls)

    @property
    def first_name(self) -> str:
        """Gets the first_name of this PassengerDetail.

        The passenger's first name  # noqa: E501

        :return: The first_name of this PassengerDetail.
        :rtype: str
        """
        return self._first_name

    @first_name.setter
    def first_name(self, first_name: str):
        """Sets the first_name of this PassengerDetail.

        The passenger's first name  # noqa: E501

        :param first_name: The first_name of this PassengerDetail.
        :type first_name: str
        """
        if first_name is None:
            raise ValueError("Invalid value for `first_name`, must not be `None`")  # noqa: E501

        self._first_name = first_name

    @property
    def image_url(self) -> str:
        """Gets the image_url of this PassengerDetail.

        The passenger's profile image  # noqa: E501

        :return: The image_url of this PassengerDetail.
        :rtype: str
        """
        return self._image_url

    @image_url.setter
    def image_url(self, image_url: str):
        """Sets the image_url of this PassengerDetail.

        The passenger's profile image  # noqa: E501

        :param image_url: The image_url of this PassengerDetail.
        :type image_url: str
        """
        if image_url is None:
            raise ValueError("Invalid value for `image_url`, must not be `None`")  # noqa: E501

        self._image_url = image_url

    @property
    def rating(self) -> str:
        """Gets the rating of this PassengerDetail.

        The passenger's rating  # noqa: E501

        :return: The rating of this PassengerDetail.
        :rtype: str
        """
        return self._rating

    @rating.setter
    def rating(self, rating: str):
        """Sets the rating of this PassengerDetail.

        The passenger's rating  # noqa: E501

        :param rating: The rating of this PassengerDetail.
        :type rating: str
        """
        if rating is None:
            raise ValueError("Invalid value for `rating`, must not be `None`")  # noqa: E501

        self._rating = rating

    @property
    def last_name(self) -> str:
        """Gets the last_name of this PassengerDetail.

        The passenger's last name  # noqa: E501

        :return: The last_name of this PassengerDetail.
        :rtype: str
        """
        return self._last_name

    @last_name.setter
    def last_name(self, last_name: str):
        """Sets the last_name of this PassengerDetail.

        The passenger's last name  # noqa: E501

        :param last_name: The last_name of this PassengerDetail.
        :type last_name: str
        """

        self._last_name = last_name

    @property
    def user_id(self) -> str:
        """Gets the user_id of this PassengerDetail.

        The passenger's lyft user id  # noqa: E501

        :return: The user_id of this PassengerDetail.
        :rtype: str
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id: str):
        """Sets the user_id of this PassengerDetail.

        The passenger's lyft user id  # noqa: E501

        :param user_id: The user_id of this PassengerDetail.
        :type user_id: str
        """

        self._user_id = user_id
