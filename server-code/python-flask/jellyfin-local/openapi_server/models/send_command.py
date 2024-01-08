from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.send_command_type import SendCommandType
from openapi_server import util

from openapi_server.models.send_command_type import SendCommandType  # noqa: E501

class SendCommand(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, command=None, emitted_at=None, group_id=None, playlist_item_id=None, position_ticks=None, when=None):  # noqa: E501
        """SendCommand - a model defined in OpenAPI

        :param command: The command of this SendCommand.  # noqa: E501
        :type command: SendCommandType
        :param emitted_at: The emitted_at of this SendCommand.  # noqa: E501
        :type emitted_at: datetime
        :param group_id: The group_id of this SendCommand.  # noqa: E501
        :type group_id: str
        :param playlist_item_id: The playlist_item_id of this SendCommand.  # noqa: E501
        :type playlist_item_id: str
        :param position_ticks: The position_ticks of this SendCommand.  # noqa: E501
        :type position_ticks: int
        :param when: The when of this SendCommand.  # noqa: E501
        :type when: datetime
        """
        self.openapi_types = {
            'command': SendCommandType,
            'emitted_at': datetime,
            'group_id': str,
            'playlist_item_id': str,
            'position_ticks': int,
            'when': datetime
        }

        self.attribute_map = {
            'command': 'Command',
            'emitted_at': 'EmittedAt',
            'group_id': 'GroupId',
            'playlist_item_id': 'PlaylistItemId',
            'position_ticks': 'PositionTicks',
            'when': 'When'
        }

        self._command = command
        self._emitted_at = emitted_at
        self._group_id = group_id
        self._playlist_item_id = playlist_item_id
        self._position_ticks = position_ticks
        self._when = when

    @classmethod
    def from_dict(cls, dikt) -> 'SendCommand':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SendCommand of this SendCommand.  # noqa: E501
        :rtype: SendCommand
        """
        return util.deserialize_model(dikt, cls)

    @property
    def command(self) -> SendCommandType:
        """Gets the command of this SendCommand.


        :return: The command of this SendCommand.
        :rtype: SendCommandType
        """
        return self._command

    @command.setter
    def command(self, command: SendCommandType):
        """Sets the command of this SendCommand.


        :param command: The command of this SendCommand.
        :type command: SendCommandType
        """

        self._command = command

    @property
    def emitted_at(self) -> datetime:
        """Gets the emitted_at of this SendCommand.

        Gets the UTC time when this command has been emitted.  # noqa: E501

        :return: The emitted_at of this SendCommand.
        :rtype: datetime
        """
        return self._emitted_at

    @emitted_at.setter
    def emitted_at(self, emitted_at: datetime):
        """Sets the emitted_at of this SendCommand.

        Gets the UTC time when this command has been emitted.  # noqa: E501

        :param emitted_at: The emitted_at of this SendCommand.
        :type emitted_at: datetime
        """

        self._emitted_at = emitted_at

    @property
    def group_id(self) -> str:
        """Gets the group_id of this SendCommand.

        Gets the group identifier.  # noqa: E501

        :return: The group_id of this SendCommand.
        :rtype: str
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id: str):
        """Sets the group_id of this SendCommand.

        Gets the group identifier.  # noqa: E501

        :param group_id: The group_id of this SendCommand.
        :type group_id: str
        """

        self._group_id = group_id

    @property
    def playlist_item_id(self) -> str:
        """Gets the playlist_item_id of this SendCommand.

        Gets the playlist identifier of the playing item.  # noqa: E501

        :return: The playlist_item_id of this SendCommand.
        :rtype: str
        """
        return self._playlist_item_id

    @playlist_item_id.setter
    def playlist_item_id(self, playlist_item_id: str):
        """Sets the playlist_item_id of this SendCommand.

        Gets the playlist identifier of the playing item.  # noqa: E501

        :param playlist_item_id: The playlist_item_id of this SendCommand.
        :type playlist_item_id: str
        """

        self._playlist_item_id = playlist_item_id

    @property
    def position_ticks(self) -> int:
        """Gets the position_ticks of this SendCommand.

        Gets the position ticks.  # noqa: E501

        :return: The position_ticks of this SendCommand.
        :rtype: int
        """
        return self._position_ticks

    @position_ticks.setter
    def position_ticks(self, position_ticks: int):
        """Sets the position_ticks of this SendCommand.

        Gets the position ticks.  # noqa: E501

        :param position_ticks: The position_ticks of this SendCommand.
        :type position_ticks: int
        """

        self._position_ticks = position_ticks

    @property
    def when(self) -> datetime:
        """Gets the when of this SendCommand.

        Gets or sets the UTC time when to execute the command.  # noqa: E501

        :return: The when of this SendCommand.
        :rtype: datetime
        """
        return self._when

    @when.setter
    def when(self, when: datetime):
        """Sets the when of this SendCommand.

        Gets or sets the UTC time when to execute the command.  # noqa: E501

        :param when: The when of this SendCommand.
        :type when: datetime
        """

        self._when = when