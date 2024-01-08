from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.personalised_radio_meta_data import PersonalisedRadioMetaData
from openapi_server import util

from openapi_server.models.personalised_radio_meta_data import PersonalisedRadioMetaData  # noqa: E501

class PersonalisedRadioBatchRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, action=None, added_at=None, context=None, id=None, metadata=None, type=None):  # noqa: E501
        """PersonalisedRadioBatchRequest - a model defined in OpenAPI

        :param action: The action of this PersonalisedRadioBatchRequest.  # noqa: E501
        :type action: str
        :param added_at: The added_at of this PersonalisedRadioBatchRequest.  # noqa: E501
        :type added_at: str
        :param context: The context of this PersonalisedRadioBatchRequest.  # noqa: E501
        :type context: str
        :param id: The id of this PersonalisedRadioBatchRequest.  # noqa: E501
        :type id: str
        :param metadata: The metadata of this PersonalisedRadioBatchRequest.  # noqa: E501
        :type metadata: PersonalisedRadioMetaData
        :param type: The type of this PersonalisedRadioBatchRequest.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'action': str,
            'added_at': str,
            'context': str,
            'id': str,
            'metadata': PersonalisedRadioMetaData,
            'type': str
        }

        self.attribute_map = {
            'action': 'action',
            'added_at': 'added_at',
            'context': 'context',
            'id': 'id',
            'metadata': 'metadata',
            'type': 'type'
        }

        self._action = action
        self._added_at = added_at
        self._context = context
        self._id = id
        self._metadata = metadata
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'PersonalisedRadioBatchRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PersonalisedRadioBatchRequest of this PersonalisedRadioBatchRequest.  # noqa: E501
        :rtype: PersonalisedRadioBatchRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def action(self) -> str:
        """Gets the action of this PersonalisedRadioBatchRequest.


        :return: The action of this PersonalisedRadioBatchRequest.
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action: str):
        """Sets the action of this PersonalisedRadioBatchRequest.


        :param action: The action of this PersonalisedRadioBatchRequest.
        :type action: str
        """
        if action is None:
            raise ValueError("Invalid value for `action`, must not be `None`")  # noqa: E501

        self._action = action

    @property
    def added_at(self) -> str:
        """Gets the added_at of this PersonalisedRadioBatchRequest.


        :return: The added_at of this PersonalisedRadioBatchRequest.
        :rtype: str
        """
        return self._added_at

    @added_at.setter
    def added_at(self, added_at: str):
        """Sets the added_at of this PersonalisedRadioBatchRequest.


        :param added_at: The added_at of this PersonalisedRadioBatchRequest.
        :type added_at: str
        """

        self._added_at = added_at

    @property
    def context(self) -> str:
        """Gets the context of this PersonalisedRadioBatchRequest.


        :return: The context of this PersonalisedRadioBatchRequest.
        :rtype: str
        """
        return self._context

    @context.setter
    def context(self, context: str):
        """Sets the context of this PersonalisedRadioBatchRequest.


        :param context: The context of this PersonalisedRadioBatchRequest.
        :type context: str
        """

        self._context = context

    @property
    def id(self) -> str:
        """Gets the id of this PersonalisedRadioBatchRequest.


        :return: The id of this PersonalisedRadioBatchRequest.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this PersonalisedRadioBatchRequest.


        :param id: The id of this PersonalisedRadioBatchRequest.
        :type id: str
        """

        self._id = id

    @property
    def metadata(self) -> PersonalisedRadioMetaData:
        """Gets the metadata of this PersonalisedRadioBatchRequest.


        :return: The metadata of this PersonalisedRadioBatchRequest.
        :rtype: PersonalisedRadioMetaData
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata: PersonalisedRadioMetaData):
        """Sets the metadata of this PersonalisedRadioBatchRequest.


        :param metadata: The metadata of this PersonalisedRadioBatchRequest.
        :type metadata: PersonalisedRadioMetaData
        """

        self._metadata = metadata

    @property
    def type(self) -> str:
        """Gets the type of this PersonalisedRadioBatchRequest.


        :return: The type of this PersonalisedRadioBatchRequest.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this PersonalisedRadioBatchRequest.


        :param type: The type of this PersonalisedRadioBatchRequest.
        :type type: str
        """

        self._type = type
