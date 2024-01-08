import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.base_item_dto_query_result import BaseItemDtoQueryResult  # noqa: E501
from openapi_server.models.image_type import ImageType  # noqa: E501
from openapi_server.models.item_fields import ItemFields  # noqa: E501
from openapi_server import util


def get_instant_mix_from_album(id, user_id=None, limit=None, fields=None, enable_images=None, enable_user_data=None, image_type_limit=None, enable_image_types=None):  # noqa: E501
    """Creates an instant playlist based on a given song.

     # noqa: E501

    :param id: The item id.
    :type id: str
    :type id: str
    :param user_id: Optional. Filter by user id, and attach user data.
    :type user_id: str
    :type user_id: str
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param fields: Optional. Specify additional fields of information to return in the output.
    :type fields: list | bytes
    :param enable_images: Optional. Include image information in output.
    :type enable_images: bool
    :param enable_user_data: Optional. Include user data.
    :type enable_user_data: bool
    :param image_type_limit: Optional. The max number of images to return, per image type.
    :type image_type_limit: int
    :param enable_image_types: Optional. The image types to include in the output.
    :type enable_image_types: list | bytes

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        enable_image_types = [ImageType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_instant_mix_from_artists(id, user_id=None, limit=None, fields=None, enable_images=None, enable_user_data=None, image_type_limit=None, enable_image_types=None):  # noqa: E501
    """Creates an instant playlist based on a given song.

     # noqa: E501

    :param id: The item id.
    :type id: str
    :type id: str
    :param user_id: Optional. Filter by user id, and attach user data.
    :type user_id: str
    :type user_id: str
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param fields: Optional. Specify additional fields of information to return in the output.
    :type fields: list | bytes
    :param enable_images: Optional. Include image information in output.
    :type enable_images: bool
    :param enable_user_data: Optional. Include user data.
    :type enable_user_data: bool
    :param image_type_limit: Optional. The max number of images to return, per image type.
    :type image_type_limit: int
    :param enable_image_types: Optional. The image types to include in the output.
    :type enable_image_types: list | bytes

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        enable_image_types = [ImageType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_instant_mix_from_item(id, user_id=None, limit=None, fields=None, enable_images=None, enable_user_data=None, image_type_limit=None, enable_image_types=None):  # noqa: E501
    """Creates an instant playlist based on a given song.

     # noqa: E501

    :param id: The item id.
    :type id: str
    :type id: str
    :param user_id: Optional. Filter by user id, and attach user data.
    :type user_id: str
    :type user_id: str
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param fields: Optional. Specify additional fields of information to return in the output.
    :type fields: list | bytes
    :param enable_images: Optional. Include image information in output.
    :type enable_images: bool
    :param enable_user_data: Optional. Include user data.
    :type enable_user_data: bool
    :param image_type_limit: Optional. The max number of images to return, per image type.
    :type image_type_limit: int
    :param enable_image_types: Optional. The image types to include in the output.
    :type enable_image_types: list | bytes

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        enable_image_types = [ImageType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_instant_mix_from_music_genre(name, user_id=None, limit=None, fields=None, enable_images=None, enable_user_data=None, image_type_limit=None, enable_image_types=None):  # noqa: E501
    """Creates an instant playlist based on a given song.

     # noqa: E501

    :param name: The genre name.
    :type name: str
    :param user_id: Optional. Filter by user id, and attach user data.
    :type user_id: str
    :type user_id: str
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param fields: Optional. Specify additional fields of information to return in the output.
    :type fields: list | bytes
    :param enable_images: Optional. Include image information in output.
    :type enable_images: bool
    :param enable_user_data: Optional. Include user data.
    :type enable_user_data: bool
    :param image_type_limit: Optional. The max number of images to return, per image type.
    :type image_type_limit: int
    :param enable_image_types: Optional. The image types to include in the output.
    :type enable_image_types: list | bytes

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        enable_image_types = [ImageType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_instant_mix_from_music_genres(id, user_id=None, limit=None, fields=None, enable_images=None, enable_user_data=None, image_type_limit=None, enable_image_types=None):  # noqa: E501
    """Creates an instant playlist based on a given song.

     # noqa: E501

    :param id: The item id.
    :type id: str
    :type id: str
    :param user_id: Optional. Filter by user id, and attach user data.
    :type user_id: str
    :type user_id: str
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param fields: Optional. Specify additional fields of information to return in the output.
    :type fields: list | bytes
    :param enable_images: Optional. Include image information in output.
    :type enable_images: bool
    :param enable_user_data: Optional. Include user data.
    :type enable_user_data: bool
    :param image_type_limit: Optional. The max number of images to return, per image type.
    :type image_type_limit: int
    :param enable_image_types: Optional. The image types to include in the output.
    :type enable_image_types: list | bytes

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        enable_image_types = [ImageType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_instant_mix_from_playlist(id, user_id=None, limit=None, fields=None, enable_images=None, enable_user_data=None, image_type_limit=None, enable_image_types=None):  # noqa: E501
    """Creates an instant playlist based on a given song.

     # noqa: E501

    :param id: The item id.
    :type id: str
    :type id: str
    :param user_id: Optional. Filter by user id, and attach user data.
    :type user_id: str
    :type user_id: str
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param fields: Optional. Specify additional fields of information to return in the output.
    :type fields: list | bytes
    :param enable_images: Optional. Include image information in output.
    :type enable_images: bool
    :param enable_user_data: Optional. Include user data.
    :type enable_user_data: bool
    :param image_type_limit: Optional. The max number of images to return, per image type.
    :type image_type_limit: int
    :param enable_image_types: Optional. The image types to include in the output.
    :type enable_image_types: list | bytes

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        enable_image_types = [ImageType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def get_instant_mix_from_song(id, user_id=None, limit=None, fields=None, enable_images=None, enable_user_data=None, image_type_limit=None, enable_image_types=None):  # noqa: E501
    """Creates an instant playlist based on a given song.

     # noqa: E501

    :param id: The item id.
    :type id: str
    :type id: str
    :param user_id: Optional. Filter by user id, and attach user data.
    :type user_id: str
    :type user_id: str
    :param limit: Optional. The maximum number of records to return.
    :type limit: int
    :param fields: Optional. Specify additional fields of information to return in the output.
    :type fields: list | bytes
    :param enable_images: Optional. Include image information in output.
    :type enable_images: bool
    :param enable_user_data: Optional. Include user data.
    :type enable_user_data: bool
    :param image_type_limit: Optional. The max number of images to return, per image type.
    :type image_type_limit: int
    :param enable_image_types: Optional. The image types to include in the output.
    :type enable_image_types: list | bytes

    :rtype: Union[BaseItemDtoQueryResult, Tuple[BaseItemDtoQueryResult, int], Tuple[BaseItemDtoQueryResult, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        fields = [ItemFields.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    if connexion.request.is_json:
        enable_image_types = [ImageType.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'
