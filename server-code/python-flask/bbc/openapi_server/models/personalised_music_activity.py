from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.personalised_music_data import PersonalisedMusicData
from openapi_server.models.personalised_music_meta_data import PersonalisedMusicMetaData
from openapi_server import util

from openapi_server.models.personalised_music_data import PersonalisedMusicData  # noqa: E501
from openapi_server.models.personalised_music_meta_data import PersonalisedMusicMetaData  # noqa: E501

class PersonalisedMusicActivity(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, action=None, activity=None, added_at=None, data=None, domain=None, id=None, meta_data=None, type=None, urn=None):  # noqa: E501
        """PersonalisedMusicActivity - a model defined in OpenAPI

        :param action: The action of this PersonalisedMusicActivity.  # noqa: E501
        :type action: str
        :param activity: The activity of this PersonalisedMusicActivity.  # noqa: E501
        :type activity: str
        :param added_at: The added_at of this PersonalisedMusicActivity.  # noqa: E501
        :type added_at: str
        :param data: The data of this PersonalisedMusicActivity.  # noqa: E501
        :type data: List[PersonalisedMusicData]
        :param domain: The domain of this PersonalisedMusicActivity.  # noqa: E501
        :type domain: str
        :param id: The id of this PersonalisedMusicActivity.  # noqa: E501
        :type id: str
        :param meta_data: The meta_data of this PersonalisedMusicActivity.  # noqa: E501
        :type meta_data: PersonalisedMusicMetaData
        :param type: The type of this PersonalisedMusicActivity.  # noqa: E501
        :type type: str
        :param urn: The urn of this PersonalisedMusicActivity.  # noqa: E501
        :type urn: str
        """
        self.openapi_types = {
            'action': str,
            'activity': str,
            'added_at': str,
            'data': List[PersonalisedMusicData],
            'domain': str,
            'id': str,
            'meta_data': PersonalisedMusicMetaData,
            'type': str,
            'urn': str
        }

        self.attribute_map = {
            'action': 'action',
            'activity': 'activity',
            'added_at': 'added_at',
            'data': 'data',
            'domain': 'domain',
            'id': 'id',
            'meta_data': 'meta_data',
            'type': 'type',
            'urn': 'urn'
        }

        self._action = action
        self._activity = activity
        self._added_at = added_at
        self._data = data
        self._domain = domain
        self._id = id
        self._meta_data = meta_data
        self._type = type
        self._urn = urn

    @classmethod
    def from_dict(cls, dikt) -> 'PersonalisedMusicActivity':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PersonalisedMusicActivity of this PersonalisedMusicActivity.  # noqa: E501
        :rtype: PersonalisedMusicActivity
        """
        return util.deserialize_model(dikt, cls)

    @property
    def action(self) -> str:
        """Gets the action of this PersonalisedMusicActivity.


        :return: The action of this PersonalisedMusicActivity.
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action: str):
        """Sets the action of this PersonalisedMusicActivity.


        :param action: The action of this PersonalisedMusicActivity.
        :type action: str
        """
        if action is None:
            raise ValueError("Invalid value for `action`, must not be `None`")  # noqa: E501

        self._action = action

    @property
    def activity(self) -> str:
        """Gets the activity of this PersonalisedMusicActivity.


        :return: The activity of this PersonalisedMusicActivity.
        :rtype: str
        """
        return self._activity

    @activity.setter
    def activity(self, activity: str):
        """Sets the activity of this PersonalisedMusicActivity.


        :param activity: The activity of this PersonalisedMusicActivity.
        :type activity: str
        """
        if activity is None:
            raise ValueError("Invalid value for `activity`, must not be `None`")  # noqa: E501

        self._activity = activity

    @property
    def added_at(self) -> str:
        """Gets the added_at of this PersonalisedMusicActivity.


        :return: The added_at of this PersonalisedMusicActivity.
        :rtype: str
        """
        return self._added_at

    @added_at.setter
    def added_at(self, added_at: str):
        """Sets the added_at of this PersonalisedMusicActivity.


        :param added_at: The added_at of this PersonalisedMusicActivity.
        :type added_at: str
        """
        if added_at is None:
            raise ValueError("Invalid value for `added_at`, must not be `None`")  # noqa: E501

        self._added_at = added_at

    @property
    def data(self) -> List[PersonalisedMusicData]:
        """Gets the data of this PersonalisedMusicActivity.


        :return: The data of this PersonalisedMusicActivity.
        :rtype: List[PersonalisedMusicData]
        """
        return self._data

    @data.setter
    def data(self, data: List[PersonalisedMusicData]):
        """Sets the data of this PersonalisedMusicActivity.


        :param data: The data of this PersonalisedMusicActivity.
        :type data: List[PersonalisedMusicData]
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data

    @property
    def domain(self) -> str:
        """Gets the domain of this PersonalisedMusicActivity.


        :return: The domain of this PersonalisedMusicActivity.
        :rtype: str
        """
        return self._domain

    @domain.setter
    def domain(self, domain: str):
        """Sets the domain of this PersonalisedMusicActivity.


        :param domain: The domain of this PersonalisedMusicActivity.
        :type domain: str
        """
        if domain is None:
            raise ValueError("Invalid value for `domain`, must not be `None`")  # noqa: E501

        self._domain = domain

    @property
    def id(self) -> str:
        """Gets the id of this PersonalisedMusicActivity.


        :return: The id of this PersonalisedMusicActivity.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this PersonalisedMusicActivity.


        :param id: The id of this PersonalisedMusicActivity.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def meta_data(self) -> PersonalisedMusicMetaData:
        """Gets the meta_data of this PersonalisedMusicActivity.


        :return: The meta_data of this PersonalisedMusicActivity.
        :rtype: PersonalisedMusicMetaData
        """
        return self._meta_data

    @meta_data.setter
    def meta_data(self, meta_data: PersonalisedMusicMetaData):
        """Sets the meta_data of this PersonalisedMusicActivity.


        :param meta_data: The meta_data of this PersonalisedMusicActivity.
        :type meta_data: PersonalisedMusicMetaData
        """
        if meta_data is None:
            raise ValueError("Invalid value for `meta_data`, must not be `None`")  # noqa: E501

        self._meta_data = meta_data

    @property
    def type(self) -> str:
        """Gets the type of this PersonalisedMusicActivity.


        :return: The type of this PersonalisedMusicActivity.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this PersonalisedMusicActivity.


        :param type: The type of this PersonalisedMusicActivity.
        :type type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501

        self._type = type

    @property
    def urn(self) -> str:
        """Gets the urn of this PersonalisedMusicActivity.


        :return: The urn of this PersonalisedMusicActivity.
        :rtype: str
        """
        return self._urn

    @urn.setter
    def urn(self, urn: str):
        """Sets the urn of this PersonalisedMusicActivity.


        :param urn: The urn of this PersonalisedMusicActivity.
        :type urn: str
        """
        if urn is None:
            raise ValueError("Invalid value for `urn`, must not be `None`")  # noqa: E501

        self._urn = urn
