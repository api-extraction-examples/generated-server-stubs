import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.client_capabilities_dto import ClientCapabilitiesDto  # noqa: E501
from openapi_server.models.general_command import GeneralCommand  # noqa: E501
from openapi_server.models.general_command_type import GeneralCommandType  # noqa: E501
from openapi_server.models.name_id_pair import NameIdPair  # noqa: E501
from openapi_server.models.play_command import PlayCommand  # noqa: E501
from openapi_server.models.playstate_command import PlaystateCommand  # noqa: E501
from openapi_server.models.session_info import SessionInfo  # noqa: E501
from openapi_server import util


def add_user_to_session(session_id, user_id):  # noqa: E501
    """Adds an additional user to a session.

     # noqa: E501

    :param session_id: The session id.
    :type session_id: str
    :param user_id: The user id.
    :type user_id: str
    :type user_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def display_content(session_id, item_type, item_id, item_name):  # noqa: E501
    """Instructs a session to browse to an item or view.

     # noqa: E501

    :param session_id: The session Id.
    :type session_id: str
    :param item_type: The type of item to browse to.
    :type item_type: str
    :param item_id: The Id of the item.
    :type item_id: str
    :param item_name: The name of the item.
    :type item_name: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_auth_providers():  # noqa: E501
    """Get all auth providers.

     # noqa: E501


    :rtype: Union[List[NameIdPair], Tuple[List[NameIdPair], int], Tuple[List[NameIdPair], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_password_reset_providers():  # noqa: E501
    """Get all password reset providers.

     # noqa: E501


    :rtype: Union[List[NameIdPair], Tuple[List[NameIdPair], int], Tuple[List[NameIdPair], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_sessions(controllable_by_user_id=None, device_id=None, active_within_seconds=None):  # noqa: E501
    """Gets a list of sessions.

     # noqa: E501

    :param controllable_by_user_id: Filter by sessions that a given user is allowed to remote control.
    :type controllable_by_user_id: str
    :type controllable_by_user_id: str
    :param device_id: Filter by device Id.
    :type device_id: str
    :param active_within_seconds: Optional. Filter by sessions that were active in the last n seconds.
    :type active_within_seconds: int

    :rtype: Union[List[SessionInfo], Tuple[List[SessionInfo], int], Tuple[List[SessionInfo], int, Dict[str, str]]
    """
    return 'do some magic!'


def play(session_id, play_command, item_ids, start_position_ticks=None):  # noqa: E501
    """Instructs a session to play an item.

     # noqa: E501

    :param session_id: The session id.
    :type session_id: str
    :param play_command: The type of play command to issue (PlayNow, PlayNext, PlayLast). Clients who have not yet implemented play next and play last may play now.
    :type play_command: dict | bytes
    :param item_ids: The ids of the items to play, comma delimited.
    :type item_ids: List[str]
    :param start_position_ticks: The starting position of the first item.
    :type start_position_ticks: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        play_command =  PlayCommand.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_capabilities(id=None, playable_media_types=None, supported_commands=None, supports_media_control=None, supports_sync=None, supports_persistent_identifier=None):  # noqa: E501
    """Updates capabilities for a device.

     # noqa: E501

    :param id: The session id.
    :type id: str
    :param playable_media_types: A list of playable media types, comma delimited. Audio, Video, Book, Photo.
    :type playable_media_types: List[str]
    :param supported_commands: A list of supported remote control commands, comma delimited.
    :type supported_commands: list | bytes
    :param supports_media_control: Determines whether media can be played remotely..
    :type supports_media_control: bool
    :param supports_sync: Determines whether sync is supported.
    :type supports_sync: bool
    :param supports_persistent_identifier: Determines whether the device supports a unique identifier.
    :type supports_persistent_identifier: bool

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        supported_commands = [GeneralCommandType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def post_full_capabilities(client_capabilities_dto, id=None):  # noqa: E501
    """Updates capabilities for a device.

     # noqa: E501

    :param client_capabilities_dto: The MediaBrowser.Model.Session.ClientCapabilities.
    :type client_capabilities_dto: dict | bytes
    :param id: The session id.
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        client_capabilities_dto = ClientCapabilitiesDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def remove_user_from_session(session_id, user_id):  # noqa: E501
    """Removes an additional user from a session.

     # noqa: E501

    :param session_id: The session id.
    :type session_id: str
    :param user_id: The user id.
    :type user_id: str
    :type user_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def report_session_ended():  # noqa: E501
    """Reports that a session has ended.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def report_viewing(item_id, session_id=None):  # noqa: E501
    """Reports that a session is viewing an item.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :param session_id: The session id.
    :type session_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def send_full_general_command(session_id, general_command):  # noqa: E501
    """Issues a full general command to a client.

     # noqa: E501

    :param session_id: The session id.
    :type session_id: str
    :param general_command: The MediaBrowser.Model.Session.GeneralCommand.
    :type general_command: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        general_command = GeneralCommand.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def send_general_command(session_id, command):  # noqa: E501
    """Issues a general command to a client.

     # noqa: E501

    :param session_id: The session id.
    :type session_id: str
    :param command: The command to send.
    :type command: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        command =  GeneralCommandType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def send_message_command(session_id, text, header=None, timeout_ms=None):  # noqa: E501
    """Issues a command to a client to display a message to the user.

     # noqa: E501

    :param session_id: The session id.
    :type session_id: str
    :param text: The message test.
    :type text: str
    :param header: The message header.
    :type header: str
    :param timeout_ms: The message timeout. If omitted the user will have to confirm viewing the message.
    :type timeout_ms: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def send_playstate_command(session_id, command, seek_position_ticks=None, controlling_user_id=None):  # noqa: E501
    """Issues a playstate command to a client.

     # noqa: E501

    :param session_id: The session id.
    :type session_id: str
    :param command: The MediaBrowser.Model.Session.PlaystateCommand.
    :type command: dict | bytes
    :param seek_position_ticks: The optional position ticks.
    :type seek_position_ticks: int
    :param controlling_user_id: The optional controlling user id.
    :type controlling_user_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        command =  PlaystateCommand.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def send_system_command(session_id, command):  # noqa: E501
    """Issues a system command to a client.

     # noqa: E501

    :param session_id: The session id.
    :type session_id: str
    :param command: The command to send.
    :type command: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        command =  GeneralCommandType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
