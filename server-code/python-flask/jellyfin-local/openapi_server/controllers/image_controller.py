import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.image_format import ImageFormat  # noqa: E501
from openapi_server.models.image_info import ImageInfo  # noqa: E501
from openapi_server.models.image_type import ImageType  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server import util


def delete_item_image(item_id, image_type, image_index=None):  # noqa: E501
    """Delete an item&#39;s image.

     # noqa: E501

    :param item_id: Item id.
    :type item_id: str
    :type item_id: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param image_index: The image index.
    :type image_index: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_item_image_by_index(item_id, image_type, image_index):  # noqa: E501
    """Delete an item&#39;s image.

     # noqa: E501

    :param item_id: Item id.
    :type item_id: str
    :type item_id: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param image_index: The image index.
    :type image_index: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_user_image(user_id, image_type, index=None):  # noqa: E501
    """Delete the user&#39;s image.

     # noqa: E501

    :param user_id: User Id.
    :type user_id: str
    :type user_id: str
    :param image_type: (Unused) Image type.
    :type image_type: dict | bytes
    :param index: (Unused) Image index.
    :type index: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_user_image_by_index(user_id, image_type, index):  # noqa: E501
    """Delete the user&#39;s image.

     # noqa: E501

    :param user_id: User Id.
    :type user_id: str
    :type user_id: str
    :param image_type: (Unused) Image type.
    :type image_type: dict | bytes
    :param index: (Unused) Image index.
    :type index: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_artist_image(name, image_type, image_index, tag=None, format=None, max_width=None, max_height=None, percent_played=None, unplayed_count=None, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None):  # noqa: E501
    """Get artist image by name.

     # noqa: E501

    :param name: Artist name.
    :type name: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param image_index: Image index.
    :type image_index: int
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_genre_image(name, image_type, tag=None, format=None, max_width=None, max_height=None, percent_played=None, unplayed_count=None, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None, image_index=None):  # noqa: E501
    """Get genre image by name.

     # noqa: E501

    :param name: Genre name.
    :type name: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str
    :param image_index: Image index.
    :type image_index: int

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_genre_image_by_index(name, image_type, image_index, tag=None, format=None, max_width=None, max_height=None, percent_played=None, unplayed_count=None, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None):  # noqa: E501
    """Get genre image by name.

     # noqa: E501

    :param name: Genre name.
    :type name: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param image_index: Image index.
    :type image_index: int
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_item_image(item_id, image_type, max_width=None, max_height=None, width=None, height=None, quality=None, tag=None, crop_whitespace=None, format=None, add_played_indicator=None, percent_played=None, unplayed_count=None, blur=None, background_color=None, foreground_layer=None, image_index=None):  # noqa: E501
    """Gets the item&#39;s image.

     # noqa: E501

    :param item_id: Item id.
    :type item_id: str
    :type item_id: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param format: Optional. The MediaBrowser.Model.Drawing.ImageFormat of the returned image.
    :type format: dict | bytes
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str
    :param image_index: Image index.
    :type image_index: int

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_item_image2(item_id, image_type, max_width, max_height, tag, format, percent_played, unplayed_count, image_index, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None):  # noqa: E501
    """Gets the item&#39;s image.

     # noqa: E501

    :param item_id: Item id.
    :type item_id: str
    :type item_id: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param image_index: Image index.
    :type image_index: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_item_image_by_index(item_id, image_type, image_index, max_width=None, max_height=None, width=None, height=None, quality=None, tag=None, crop_whitespace=None, format=None, add_played_indicator=None, percent_played=None, unplayed_count=None, blur=None, background_color=None, foreground_layer=None):  # noqa: E501
    """Gets the item&#39;s image.

     # noqa: E501

    :param item_id: Item id.
    :type item_id: str
    :type item_id: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param image_index: Image index.
    :type image_index: int
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param format: Optional. The MediaBrowser.Model.Drawing.ImageFormat of the returned image.
    :type format: dict | bytes
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_item_image_infos(item_id):  # noqa: E501
    """Get item image infos.

     # noqa: E501

    :param item_id: Item id.
    :type item_id: str
    :type item_id: str

    :rtype: Union[List[ImageInfo], Tuple[List[ImageInfo], int], Tuple[List[ImageInfo], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_music_genre_image(name, image_type, tag=None, format=None, max_width=None, max_height=None, percent_played=None, unplayed_count=None, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None, image_index=None):  # noqa: E501
    """Get music genre image by name.

     # noqa: E501

    :param name: Music genre name.
    :type name: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str
    :param image_index: Image index.
    :type image_index: int

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_music_genre_image_by_index(name, image_type, image_index, tag=None, format=None, max_width=None, max_height=None, percent_played=None, unplayed_count=None, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None):  # noqa: E501
    """Get music genre image by name.

     # noqa: E501

    :param name: Music genre name.
    :type name: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param image_index: Image index.
    :type image_index: int
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_person_image(name, image_type, tag=None, format=None, max_width=None, max_height=None, percent_played=None, unplayed_count=None, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None, image_index=None):  # noqa: E501
    """Get person image by name.

     # noqa: E501

    :param name: Person name.
    :type name: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str
    :param image_index: Image index.
    :type image_index: int

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_person_image_by_index(name, image_type, image_index, tag=None, format=None, max_width=None, max_height=None, percent_played=None, unplayed_count=None, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None):  # noqa: E501
    """Get person image by name.

     # noqa: E501

    :param name: Person name.
    :type name: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param image_index: Image index.
    :type image_index: int
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_studio_image(name, image_type, tag=None, format=None, max_width=None, max_height=None, percent_played=None, unplayed_count=None, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None, image_index=None):  # noqa: E501
    """Get studio image by name.

     # noqa: E501

    :param name: Studio name.
    :type name: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str
    :param image_index: Image index.
    :type image_index: int

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_studio_image_by_index(name, image_type, image_index, tag=None, format=None, max_width=None, max_height=None, percent_played=None, unplayed_count=None, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None):  # noqa: E501
    """Get studio image by name.

     # noqa: E501

    :param name: Studio name.
    :type name: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param image_index: Image index.
    :type image_index: int
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_user_image(user_id, image_type, tag=None, format=None, max_width=None, max_height=None, percent_played=None, unplayed_count=None, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None, image_index=None):  # noqa: E501
    """Get user profile image.

     # noqa: E501

    :param user_id: User id.
    :type user_id: str
    :type user_id: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str
    :param image_index: Image index.
    :type image_index: int

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_user_image_by_index(user_id, image_type, image_index, tag=None, format=None, max_width=None, max_height=None, percent_played=None, unplayed_count=None, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None):  # noqa: E501
    """Get user profile image.

     # noqa: E501

    :param user_id: User id.
    :type user_id: str
    :type user_id: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param image_index: Image index.
    :type image_index: int
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def head_artist_image(name, image_type, image_index, tag=None, format=None, max_width=None, max_height=None, percent_played=None, unplayed_count=None, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None):  # noqa: E501
    """Get artist image by name.

     # noqa: E501

    :param name: Artist name.
    :type name: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param image_index: Image index.
    :type image_index: int
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def head_genre_image(name, image_type, tag=None, format=None, max_width=None, max_height=None, percent_played=None, unplayed_count=None, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None, image_index=None):  # noqa: E501
    """Get genre image by name.

     # noqa: E501

    :param name: Genre name.
    :type name: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str
    :param image_index: Image index.
    :type image_index: int

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def head_genre_image_by_index(name, image_type, image_index, tag=None, format=None, max_width=None, max_height=None, percent_played=None, unplayed_count=None, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None):  # noqa: E501
    """Get genre image by name.

     # noqa: E501

    :param name: Genre name.
    :type name: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param image_index: Image index.
    :type image_index: int
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def head_item_image(item_id, image_type, max_width=None, max_height=None, width=None, height=None, quality=None, tag=None, crop_whitespace=None, format=None, add_played_indicator=None, percent_played=None, unplayed_count=None, blur=None, background_color=None, foreground_layer=None, image_index=None):  # noqa: E501
    """Gets the item&#39;s image.

     # noqa: E501

    :param item_id: Item id.
    :type item_id: str
    :type item_id: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param format: Optional. The MediaBrowser.Model.Drawing.ImageFormat of the returned image.
    :type format: dict | bytes
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str
    :param image_index: Image index.
    :type image_index: int

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def head_item_image2(item_id, image_type, max_width, max_height, tag, format, percent_played, unplayed_count, image_index, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None):  # noqa: E501
    """Gets the item&#39;s image.

     # noqa: E501

    :param item_id: Item id.
    :type item_id: str
    :type item_id: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param image_index: Image index.
    :type image_index: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def head_item_image_by_index(item_id, image_type, image_index, max_width=None, max_height=None, width=None, height=None, quality=None, tag=None, crop_whitespace=None, format=None, add_played_indicator=None, percent_played=None, unplayed_count=None, blur=None, background_color=None, foreground_layer=None):  # noqa: E501
    """Gets the item&#39;s image.

     # noqa: E501

    :param item_id: Item id.
    :type item_id: str
    :type item_id: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param image_index: Image index.
    :type image_index: int
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param format: Optional. The MediaBrowser.Model.Drawing.ImageFormat of the returned image.
    :type format: dict | bytes
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def head_music_genre_image(name, image_type, tag=None, format=None, max_width=None, max_height=None, percent_played=None, unplayed_count=None, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None, image_index=None):  # noqa: E501
    """Get music genre image by name.

     # noqa: E501

    :param name: Music genre name.
    :type name: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str
    :param image_index: Image index.
    :type image_index: int

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def head_music_genre_image_by_index(name, image_type, image_index, tag=None, format=None, max_width=None, max_height=None, percent_played=None, unplayed_count=None, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None):  # noqa: E501
    """Get music genre image by name.

     # noqa: E501

    :param name: Music genre name.
    :type name: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param image_index: Image index.
    :type image_index: int
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def head_person_image(name, image_type, tag=None, format=None, max_width=None, max_height=None, percent_played=None, unplayed_count=None, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None, image_index=None):  # noqa: E501
    """Get person image by name.

     # noqa: E501

    :param name: Person name.
    :type name: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str
    :param image_index: Image index.
    :type image_index: int

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def head_person_image_by_index(name, image_type, image_index, tag=None, format=None, max_width=None, max_height=None, percent_played=None, unplayed_count=None, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None):  # noqa: E501
    """Get person image by name.

     # noqa: E501

    :param name: Person name.
    :type name: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param image_index: Image index.
    :type image_index: int
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def head_studio_image(name, image_type, tag=None, format=None, max_width=None, max_height=None, percent_played=None, unplayed_count=None, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None, image_index=None):  # noqa: E501
    """Get studio image by name.

     # noqa: E501

    :param name: Studio name.
    :type name: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str
    :param image_index: Image index.
    :type image_index: int

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def head_studio_image_by_index(name, image_type, image_index, tag=None, format=None, max_width=None, max_height=None, percent_played=None, unplayed_count=None, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None):  # noqa: E501
    """Get studio image by name.

     # noqa: E501

    :param name: Studio name.
    :type name: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param image_index: Image index.
    :type image_index: int
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def head_user_image(user_id, image_type, tag=None, format=None, max_width=None, max_height=None, percent_played=None, unplayed_count=None, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None, image_index=None):  # noqa: E501
    """Get user profile image.

     # noqa: E501

    :param user_id: User id.
    :type user_id: str
    :type user_id: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str
    :param image_index: Image index.
    :type image_index: int

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def head_user_image_by_index(user_id, image_type, image_index, tag=None, format=None, max_width=None, max_height=None, percent_played=None, unplayed_count=None, width=None, height=None, quality=None, crop_whitespace=None, add_played_indicator=None, blur=None, background_color=None, foreground_layer=None):  # noqa: E501
    """Get user profile image.

     # noqa: E501

    :param user_id: User id.
    :type user_id: str
    :type user_id: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param image_index: Image index.
    :type image_index: int
    :param tag: Optional. Supply the cache tag from the item object to receive strong caching headers.
    :type tag: str
    :param format: Determines the output format of the image - original,gif,jpg,png.
    :type format: dict | bytes
    :param max_width: The maximum image width to return.
    :type max_width: int
    :param max_height: The maximum image height to return.
    :type max_height: int
    :param percent_played: Optional. Percent to render for the percent played overlay.
    :type percent_played: float
    :param unplayed_count: Optional. Unplayed count overlay to render.
    :type unplayed_count: int
    :param width: The fixed image width to return.
    :type width: int
    :param height: The fixed image height to return.
    :type height: int
    :param quality: Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases.
    :type quality: int
    :param crop_whitespace: Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art.
    :type crop_whitespace: bool
    :param add_played_indicator: Optional. Add a played indicator.
    :type add_played_indicator: bool
    :param blur: Optional. Blur image.
    :type blur: int
    :param background_color: Optional. Apply a background color for transparent images.
    :type background_color: str
    :param foreground_layer: Optional. Apply a foreground layer on top of the image.
    :type foreground_layer: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format =  ImageFormat.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_user_image(user_id, image_type, index=None):  # noqa: E501
    """Sets the user image.

     # noqa: E501

    :param user_id: User Id.
    :type user_id: str
    :type user_id: str
    :param image_type: (Unused) Image type.
    :type image_type: dict | bytes
    :param index: (Unused) Image index.
    :type index: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_user_image_by_index(user_id, image_type, index):  # noqa: E501
    """Sets the user image.

     # noqa: E501

    :param user_id: User Id.
    :type user_id: str
    :type user_id: str
    :param image_type: (Unused) Image type.
    :type image_type: dict | bytes
    :param index: (Unused) Image index.
    :type index: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def set_item_image(item_id, image_type):  # noqa: E501
    """Set item image.

     # noqa: E501

    :param item_id: Item id.
    :type item_id: str
    :type item_id: str
    :param image_type: Image type.
    :type image_type: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def set_item_image_by_index(item_id, image_type, image_index):  # noqa: E501
    """Set item image.

     # noqa: E501

    :param item_id: Item id.
    :type item_id: str
    :type item_id: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param image_index: (Unused) Image index.
    :type image_index: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_item_image_index(item_id, image_type, image_index, new_index=None):  # noqa: E501
    """Updates the index for an item image.

     # noqa: E501

    :param item_id: Item id.
    :type item_id: str
    :type item_id: str
    :param image_type: Image type.
    :type image_type: dict | bytes
    :param image_index: Old image index.
    :type image_index: int
    :param new_index: New image index.
    :type new_index: int

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        image_type =  ImageType.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
