import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.media_encoder_path_dto import MediaEncoderPathDto  # noqa: E501
from openapi_server.models.metadata_options import MetadataOptions  # noqa: E501
from openapi_server.models.server_configuration import ServerConfiguration  # noqa: E501
from openapi_server import util


def get_configuration():  # noqa: E501
    """Gets application configuration.

     # noqa: E501


    :rtype: Union[ServerConfiguration, Tuple[ServerConfiguration, int], Tuple[ServerConfiguration, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_default_metadata_options():  # noqa: E501
    """Gets a default MetadataOptions object.

     # noqa: E501


    :rtype: Union[MetadataOptions, Tuple[MetadataOptions, int], Tuple[MetadataOptions, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_named_configuration(key):  # noqa: E501
    """Gets a named configuration.

     # noqa: E501

    :param key: Configuration key.
    :type key: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_configuration(server_configuration):  # noqa: E501
    """Updates application configuration.

     # noqa: E501

    :param server_configuration: Configuration.
    :type server_configuration: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        server_configuration = ServerConfiguration.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_media_encoder_path(media_encoder_path_dto):  # noqa: E501
    """Updates the path to the media encoder.

     # noqa: E501

    :param media_encoder_path_dto: Media encoder path form body.
    :type media_encoder_path_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        media_encoder_path_dto = MediaEncoderPathDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_named_configuration(key):  # noqa: E501
    """Updates named configuration.

     # noqa: E501

    :param key: Configuration key.
    :type key: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
