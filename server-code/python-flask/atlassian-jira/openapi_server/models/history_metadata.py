from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.history_metadata_participant import HistoryMetadataParticipant
from openapi_server import util

from openapi_server.models.history_metadata_participant import HistoryMetadataParticipant  # noqa: E501

class HistoryMetadata(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, activity_description=None, activity_description_key=None, actor=None, cause=None, description=None, description_key=None, email_description=None, email_description_key=None, extra_data=None, generator=None, type=None):  # noqa: E501
        """HistoryMetadata - a model defined in OpenAPI

        :param activity_description: The activity_description of this HistoryMetadata.  # noqa: E501
        :type activity_description: str
        :param activity_description_key: The activity_description_key of this HistoryMetadata.  # noqa: E501
        :type activity_description_key: str
        :param actor: The actor of this HistoryMetadata.  # noqa: E501
        :type actor: HistoryMetadataParticipant
        :param cause: The cause of this HistoryMetadata.  # noqa: E501
        :type cause: HistoryMetadataParticipant
        :param description: The description of this HistoryMetadata.  # noqa: E501
        :type description: str
        :param description_key: The description_key of this HistoryMetadata.  # noqa: E501
        :type description_key: str
        :param email_description: The email_description of this HistoryMetadata.  # noqa: E501
        :type email_description: str
        :param email_description_key: The email_description_key of this HistoryMetadata.  # noqa: E501
        :type email_description_key: str
        :param extra_data: The extra_data of this HistoryMetadata.  # noqa: E501
        :type extra_data: Dict[str, str]
        :param generator: The generator of this HistoryMetadata.  # noqa: E501
        :type generator: HistoryMetadataParticipant
        :param type: The type of this HistoryMetadata.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'activity_description': str,
            'activity_description_key': str,
            'actor': HistoryMetadataParticipant,
            'cause': HistoryMetadataParticipant,
            'description': str,
            'description_key': str,
            'email_description': str,
            'email_description_key': str,
            'extra_data': Dict[str, str],
            'generator': HistoryMetadataParticipant,
            'type': str
        }

        self.attribute_map = {
            'activity_description': 'activityDescription',
            'activity_description_key': 'activityDescriptionKey',
            'actor': 'actor',
            'cause': 'cause',
            'description': 'description',
            'description_key': 'descriptionKey',
            'email_description': 'emailDescription',
            'email_description_key': 'emailDescriptionKey',
            'extra_data': 'extraData',
            'generator': 'generator',
            'type': 'type'
        }

        self._activity_description = activity_description
        self._activity_description_key = activity_description_key
        self._actor = actor
        self._cause = cause
        self._description = description
        self._description_key = description_key
        self._email_description = email_description
        self._email_description_key = email_description_key
        self._extra_data = extra_data
        self._generator = generator
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'HistoryMetadata':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The HistoryMetadata of this HistoryMetadata.  # noqa: E501
        :rtype: HistoryMetadata
        """
        return util.deserialize_model(dikt, cls)

    @property
    def activity_description(self) -> str:
        """Gets the activity_description of this HistoryMetadata.

        The activity described in the history record.  # noqa: E501

        :return: The activity_description of this HistoryMetadata.
        :rtype: str
        """
        return self._activity_description

    @activity_description.setter
    def activity_description(self, activity_description: str):
        """Sets the activity_description of this HistoryMetadata.

        The activity described in the history record.  # noqa: E501

        :param activity_description: The activity_description of this HistoryMetadata.
        :type activity_description: str
        """

        self._activity_description = activity_description

    @property
    def activity_description_key(self) -> str:
        """Gets the activity_description_key of this HistoryMetadata.

        The key of the activity described in the history record.  # noqa: E501

        :return: The activity_description_key of this HistoryMetadata.
        :rtype: str
        """
        return self._activity_description_key

    @activity_description_key.setter
    def activity_description_key(self, activity_description_key: str):
        """Sets the activity_description_key of this HistoryMetadata.

        The key of the activity described in the history record.  # noqa: E501

        :param activity_description_key: The activity_description_key of this HistoryMetadata.
        :type activity_description_key: str
        """

        self._activity_description_key = activity_description_key

    @property
    def actor(self) -> HistoryMetadataParticipant:
        """Gets the actor of this HistoryMetadata.


        :return: The actor of this HistoryMetadata.
        :rtype: HistoryMetadataParticipant
        """
        return self._actor

    @actor.setter
    def actor(self, actor: HistoryMetadataParticipant):
        """Sets the actor of this HistoryMetadata.


        :param actor: The actor of this HistoryMetadata.
        :type actor: HistoryMetadataParticipant
        """

        self._actor = actor

    @property
    def cause(self) -> HistoryMetadataParticipant:
        """Gets the cause of this HistoryMetadata.


        :return: The cause of this HistoryMetadata.
        :rtype: HistoryMetadataParticipant
        """
        return self._cause

    @cause.setter
    def cause(self, cause: HistoryMetadataParticipant):
        """Sets the cause of this HistoryMetadata.


        :param cause: The cause of this HistoryMetadata.
        :type cause: HistoryMetadataParticipant
        """

        self._cause = cause

    @property
    def description(self) -> str:
        """Gets the description of this HistoryMetadata.

        The description of the history record.  # noqa: E501

        :return: The description of this HistoryMetadata.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this HistoryMetadata.

        The description of the history record.  # noqa: E501

        :param description: The description of this HistoryMetadata.
        :type description: str
        """

        self._description = description

    @property
    def description_key(self) -> str:
        """Gets the description_key of this HistoryMetadata.

        The description key of the history record.  # noqa: E501

        :return: The description_key of this HistoryMetadata.
        :rtype: str
        """
        return self._description_key

    @description_key.setter
    def description_key(self, description_key: str):
        """Sets the description_key of this HistoryMetadata.

        The description key of the history record.  # noqa: E501

        :param description_key: The description_key of this HistoryMetadata.
        :type description_key: str
        """

        self._description_key = description_key

    @property
    def email_description(self) -> str:
        """Gets the email_description of this HistoryMetadata.

        The description of the email address associated the history record.  # noqa: E501

        :return: The email_description of this HistoryMetadata.
        :rtype: str
        """
        return self._email_description

    @email_description.setter
    def email_description(self, email_description: str):
        """Sets the email_description of this HistoryMetadata.

        The description of the email address associated the history record.  # noqa: E501

        :param email_description: The email_description of this HistoryMetadata.
        :type email_description: str
        """

        self._email_description = email_description

    @property
    def email_description_key(self) -> str:
        """Gets the email_description_key of this HistoryMetadata.

        The description key of the email address associated the history record.  # noqa: E501

        :return: The email_description_key of this HistoryMetadata.
        :rtype: str
        """
        return self._email_description_key

    @email_description_key.setter
    def email_description_key(self, email_description_key: str):
        """Sets the email_description_key of this HistoryMetadata.

        The description key of the email address associated the history record.  # noqa: E501

        :param email_description_key: The email_description_key of this HistoryMetadata.
        :type email_description_key: str
        """

        self._email_description_key = email_description_key

    @property
    def extra_data(self) -> Dict[str, str]:
        """Gets the extra_data of this HistoryMetadata.

        Additional arbitrary information about the history record.  # noqa: E501

        :return: The extra_data of this HistoryMetadata.
        :rtype: Dict[str, str]
        """
        return self._extra_data

    @extra_data.setter
    def extra_data(self, extra_data: Dict[str, str]):
        """Sets the extra_data of this HistoryMetadata.

        Additional arbitrary information about the history record.  # noqa: E501

        :param extra_data: The extra_data of this HistoryMetadata.
        :type extra_data: Dict[str, str]
        """

        self._extra_data = extra_data

    @property
    def generator(self) -> HistoryMetadataParticipant:
        """Gets the generator of this HistoryMetadata.


        :return: The generator of this HistoryMetadata.
        :rtype: HistoryMetadataParticipant
        """
        return self._generator

    @generator.setter
    def generator(self, generator: HistoryMetadataParticipant):
        """Sets the generator of this HistoryMetadata.


        :param generator: The generator of this HistoryMetadata.
        :type generator: HistoryMetadataParticipant
        """

        self._generator = generator

    @property
    def type(self) -> str:
        """Gets the type of this HistoryMetadata.

        The type of the history record.  # noqa: E501

        :return: The type of this HistoryMetadata.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this HistoryMetadata.

        The type of the history record.  # noqa: E501

        :param type: The type of this HistoryMetadata.
        :type type: str
        """

        self._type = type
