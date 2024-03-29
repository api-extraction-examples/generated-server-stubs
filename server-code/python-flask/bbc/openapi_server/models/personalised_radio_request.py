from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.personalised_radio_meta_data import PersonalisedRadioMetaData
from openapi_server import util

from openapi_server.models.personalised_radio_meta_data import PersonalisedRadioMetaData  # noqa: E501

class PersonalisedRadioRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, action=None, added_at=None, context=None, metadata=None):  # noqa: E501
        """PersonalisedRadioRequest - a model defined in OpenAPI

        :param action: The action of this PersonalisedRadioRequest.  # noqa: E501
        :type action: str
        :param added_at: The added_at of this PersonalisedRadioRequest.  # noqa: E501
        :type added_at: str
        :param context: The context of this PersonalisedRadioRequest.  # noqa: E501
        :type context: str
        :param metadata: The metadata of this PersonalisedRadioRequest.  # noqa: E501
        :type metadata: PersonalisedRadioMetaData
        """
        self.openapi_types = {
            'action': str,
            'added_at': str,
            'context': str,
            'metadata': PersonalisedRadioMetaData
        }

        self.attribute_map = {
            'action': 'action',
            'added_at': 'added_at',
            'context': 'context',
            'metadata': 'metadata'
        }

        self._action = action
        self._added_at = added_at
        self._context = context
        self._metadata = metadata

    @classmethod
    def from_dict(cls, dikt) -> 'PersonalisedRadioRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PersonalisedRadioRequest of this PersonalisedRadioRequest.  # noqa: E501
        :rtype: PersonalisedRadioRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def action(self) -> str:
        """Gets the action of this PersonalisedRadioRequest.


        :return: The action of this PersonalisedRadioRequest.
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action: str):
        """Sets the action of this PersonalisedRadioRequest.


        :param action: The action of this PersonalisedRadioRequest.
        :type action: str
        """
        if action is None:
            raise ValueError("Invalid value for `action`, must not be `None`")  # noqa: E501

        self._action = action

    @property
    def added_at(self) -> str:
        """Gets the added_at of this PersonalisedRadioRequest.


        :return: The added_at of this PersonalisedRadioRequest.
        :rtype: str
        """
        return self._added_at

    @added_at.setter
    def added_at(self, added_at: str):
        """Sets the added_at of this PersonalisedRadioRequest.


        :param added_at: The added_at of this PersonalisedRadioRequest.
        :type added_at: str
        """

        self._added_at = added_at

    @property
    def context(self) -> str:
        """Gets the context of this PersonalisedRadioRequest.


        :return: The context of this PersonalisedRadioRequest.
        :rtype: str
        """
        return self._context

    @context.setter
    def context(self, context: str):
        """Sets the context of this PersonalisedRadioRequest.


        :param context: The context of this PersonalisedRadioRequest.
        :type context: str
        """

        self._context = context

    @property
    def metadata(self) -> PersonalisedRadioMetaData:
        """Gets the metadata of this PersonalisedRadioRequest.


        :return: The metadata of this PersonalisedRadioRequest.
        :rtype: PersonalisedRadioMetaData
        """
        return self._metadata

    @metadata.setter
    def metadata(self, metadata: PersonalisedRadioMetaData):
        """Sets the metadata of this PersonalisedRadioRequest.


        :param metadata: The metadata of this PersonalisedRadioRequest.
        :type metadata: PersonalisedRadioMetaData
        """

        self._metadata = metadata
