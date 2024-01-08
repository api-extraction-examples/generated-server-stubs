from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PersonalisedMusicMetaData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, key=None):  # noqa: E501
        """PersonalisedMusicMetaData - a model defined in OpenAPI

        :param key: The key of this PersonalisedMusicMetaData.  # noqa: E501
        :type key: str
        """
        self.openapi_types = {
            'key': str
        }

        self.attribute_map = {
            'key': 'key'
        }

        self._key = key

    @classmethod
    def from_dict(cls, dikt) -> 'PersonalisedMusicMetaData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PersonalisedMusicMetaData of this PersonalisedMusicMetaData.  # noqa: E501
        :rtype: PersonalisedMusicMetaData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def key(self) -> str:
        """Gets the key of this PersonalisedMusicMetaData.


        :return: The key of this PersonalisedMusicMetaData.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this PersonalisedMusicMetaData.


        :param key: The key of this PersonalisedMusicMetaData.
        :type key: str
        """
        if key is None:
            raise ValueError("Invalid value for `key`, must not be `None`")  # noqa: E501

        self._key = key
