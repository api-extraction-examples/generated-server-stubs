from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PersonalisedMusicVersion(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, classical=None, duration=None, radio=None, vpid=None):  # noqa: E501
        """PersonalisedMusicVersion - a model defined in OpenAPI

        :param classical: The classical of this PersonalisedMusicVersion.  # noqa: E501
        :type classical: bool
        :param duration: The duration of this PersonalisedMusicVersion.  # noqa: E501
        :type duration: str
        :param radio: The radio of this PersonalisedMusicVersion.  # noqa: E501
        :type radio: bool
        :param vpid: The vpid of this PersonalisedMusicVersion.  # noqa: E501
        :type vpid: str
        """
        self.openapi_types = {
            'classical': bool,
            'duration': str,
            'radio': bool,
            'vpid': str
        }

        self.attribute_map = {
            'classical': 'classical',
            'duration': 'duration',
            'radio': 'radio',
            'vpid': 'vpid'
        }

        self._classical = classical
        self._duration = duration
        self._radio = radio
        self._vpid = vpid

    @classmethod
    def from_dict(cls, dikt) -> 'PersonalisedMusicVersion':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PersonalisedMusicVersion of this PersonalisedMusicVersion.  # noqa: E501
        :rtype: PersonalisedMusicVersion
        """
        return util.deserialize_model(dikt, cls)

    @property
    def classical(self) -> bool:
        """Gets the classical of this PersonalisedMusicVersion.


        :return: The classical of this PersonalisedMusicVersion.
        :rtype: bool
        """
        return self._classical

    @classical.setter
    def classical(self, classical: bool):
        """Sets the classical of this PersonalisedMusicVersion.


        :param classical: The classical of this PersonalisedMusicVersion.
        :type classical: bool
        """

        self._classical = classical

    @property
    def duration(self) -> str:
        """Gets the duration of this PersonalisedMusicVersion.


        :return: The duration of this PersonalisedMusicVersion.
        :rtype: str
        """
        return self._duration

    @duration.setter
    def duration(self, duration: str):
        """Sets the duration of this PersonalisedMusicVersion.


        :param duration: The duration of this PersonalisedMusicVersion.
        :type duration: str
        """

        self._duration = duration

    @property
    def radio(self) -> bool:
        """Gets the radio of this PersonalisedMusicVersion.


        :return: The radio of this PersonalisedMusicVersion.
        :rtype: bool
        """
        return self._radio

    @radio.setter
    def radio(self, radio: bool):
        """Sets the radio of this PersonalisedMusicVersion.


        :param radio: The radio of this PersonalisedMusicVersion.
        :type radio: bool
        """

        self._radio = radio

    @property
    def vpid(self) -> str:
        """Gets the vpid of this PersonalisedMusicVersion.


        :return: The vpid of this PersonalisedMusicVersion.
        :rtype: str
        """
        return self._vpid

    @vpid.setter
    def vpid(self, vpid: str):
        """Sets the vpid of this PersonalisedMusicVersion.


        :param vpid: The vpid of this PersonalisedMusicVersion.
        :type vpid: str
        """

        self._vpid = vpid
