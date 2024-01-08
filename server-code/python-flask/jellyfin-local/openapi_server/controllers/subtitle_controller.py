import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.font_file import FontFile  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server.models.remote_subtitle_info import RemoteSubtitleInfo  # noqa: E501
from openapi_server.models.upload_subtitle_dto import UploadSubtitleDto  # noqa: E501
from openapi_server import util


def delete_subtitle(item_id, index):  # noqa: E501
    """Deletes an external subtitle file.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str
    :param index: The index of the subtitle file.
    :type index: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def download_remote_subtitles(item_id, subtitle_id):  # noqa: E501
    """Downloads a remote subtitle.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str
    :param subtitle_id: The subtitle id.
    :type subtitle_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_fallback_font(name):  # noqa: E501
    """Gets a fallback font file.

     # noqa: E501

    :param name: The name of the fallback font file to get.
    :type name: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_fallback_font_list():  # noqa: E501
    """Gets a list of available fallback font files.

     # noqa: E501


    :rtype: Union[List[FontFile], Tuple[List[FontFile], int], Tuple[List[FontFile], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_remote_subtitles(id):  # noqa: E501
    """Gets the remote subtitles.

     # noqa: E501

    :param id: The item id.
    :type id: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_subtitle(item_id, media_source_id, index, format, end_position_ticks=None, copy_timestamps=None, add_vtt_time_map=None, start_position_ticks=None):  # noqa: E501
    """Gets subtitles in a specified format.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str
    :param media_source_id: The media source id.
    :type media_source_id: str
    :param index: The subtitle stream index.
    :type index: int
    :param format: The format of the returned subtitle.
    :type format: str
    :param end_position_ticks: Optional. The end position of the subtitle in ticks.
    :type end_position_ticks: int
    :param copy_timestamps: Optional. Whether to copy the timestamps.
    :type copy_timestamps: bool
    :param add_vtt_time_map: Optional. Whether to add a VTT time map.
    :type add_vtt_time_map: bool
    :param start_position_ticks: Optional. The start position of the subtitle in ticks.
    :type start_position_ticks: int

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_subtitle_playlist(item_id, index, media_source_id, segment_length):  # noqa: E501
    """Gets an HLS subtitle playlist.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str
    :param index: The subtitle stream index.
    :type index: int
    :param media_source_id: The media source id.
    :type media_source_id: str
    :param segment_length: The subtitle segment length.
    :type segment_length: int

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_subtitle_with_ticks(item_id, media_source_id, index, start_position_ticks, format, end_position_ticks=None, copy_timestamps=None, add_vtt_time_map=None):  # noqa: E501
    """Gets subtitles in a specified format.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str
    :param media_source_id: The media source id.
    :type media_source_id: str
    :param index: The subtitle stream index.
    :type index: int
    :param start_position_ticks: Optional. The start position of the subtitle in ticks.
    :type start_position_ticks: int
    :param format: The format of the returned subtitle.
    :type format: str
    :param end_position_ticks: Optional. The end position of the subtitle in ticks.
    :type end_position_ticks: int
    :param copy_timestamps: Optional. Whether to copy the timestamps.
    :type copy_timestamps: bool
    :param add_vtt_time_map: Optional. Whether to add a VTT time map.
    :type add_vtt_time_map: bool

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def search_remote_subtitles(item_id, language, is_perfect_match=None):  # noqa: E501
    """Search remote subtitles.

     # noqa: E501

    :param item_id: The item id.
    :type item_id: str
    :type item_id: str
    :param language: The language of the subtitles.
    :type language: str
    :param is_perfect_match: Optional. Only show subtitles which are a perfect match.
    :type is_perfect_match: bool

    :rtype: Union[List[RemoteSubtitleInfo], Tuple[List[RemoteSubtitleInfo], int], Tuple[List[RemoteSubtitleInfo], int, Dict[str, str]]
    """
    return 'do some magic!'


def upload_subtitle(item_id, upload_subtitle_dto):  # noqa: E501
    """Upload an external subtitle file.

     # noqa: E501

    :param item_id: The item the subtitle belongs to.
    :type item_id: str
    :type item_id: str
    :param upload_subtitle_dto: The request body.
    :type upload_subtitle_dto: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        upload_subtitle_dto = UploadSubtitleDto.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
