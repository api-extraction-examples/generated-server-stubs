import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.music_export_error_response import MusicExportErrorResponse  # noqa: E501
from openapi_server.models.music_export_job import MusicExportJob  # noqa: E501
from openapi_server.models.music_export_preferences import MusicExportPreferences  # noqa: E501
from openapi_server.models.music_export_preferences_response import MusicExportPreferencesResponse  # noqa: E501
from openapi_server.models.music_export_success import MusicExportSuccess  # noqa: E501
from openapi_server import util


def delete_music_preferences_export(authorization, x_authentication_provider, x_api_key):  # noqa: E501
    """Music Export Preferences

    Remove export preferences (e.g. 3rd party vendors, partner id&#39;s) for a given BBC Music user.  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str

    :rtype: Union[MusicExportSuccess, Tuple[MusicExportSuccess, int], Tuple[MusicExportSuccess, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_music_preferences_export_vendor(authorization, x_authentication_provider, x_api_key, vendor):  # noqa: E501
    """Music Export Vendor Preferences

    Remove Vendor specific export preferences (e.g. 3rd party vendors, partner id&#39;s) for a given BBC Music user.  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param vendor: Supported 3rd Party Vendor
    :type vendor: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_music_export(authorization, x_authentication_provider, x_api_key, offset=None, limit=None):  # noqa: E501
    """Music Exports

    Returns status of all previous third party export actions for a given BBC Music user.  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param offset: Paginated results offset
    :type offset: int
    :param limit: Paginated results limit
    :type limit: int

    :rtype: Union[MusicExportJob, Tuple[MusicExportJob, int], Tuple[MusicExportJob, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_music_export_jobs(authorization, x_authentication_provider, x_api_key, over16, vendor=None):  # noqa: E501
    """Music Export Jobs

    All items associated to a users export request  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param over16: Boolean age check
    :type over16: bool
    :param vendor: Specify Vendor Jobs
    :type vendor: str

    :rtype: Union[MusicExportJob, Tuple[MusicExportJob, int], Tuple[MusicExportJob, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_music_export_tracks(authorization, x_authentication_provider, x_api_key, over16, offset=None, limit=None, vendor=None, status=None):  # noqa: E501
    """Music Export Tracks

    Retrieves vendor and status specific tracks  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param over16: Boolean age check
    :type over16: bool
    :param offset: Paginated results offset
    :type offset: int
    :param limit: Paginated results limit
    :type limit: int
    :param vendor: Specify Vendor Tracks
    :type vendor: str
    :param status: Specify Track status
    :type status: str

    :rtype: Union[MusicExportJob, Tuple[MusicExportJob, int], Tuple[MusicExportJob, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_music_preferences_export(authorization, x_authentication_provider, x_api_key):  # noqa: E501
    """Music Export Preferences

    Returns export preferences (e.g. 3rd party vendors, partner id&#39;s) for a given BBC Music user.  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str

    :rtype: Union[MusicExportPreferencesResponse, Tuple[MusicExportPreferencesResponse, int], Tuple[MusicExportPreferencesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_music_preferences_export_vendor(authorization, x_authentication_provider, x_api_key, vendor):  # noqa: E501
    """Music Export Vendor Preferences

    Returns vendor specific export preferences for a given BBC Music user.  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param vendor: Supported 3rd Party Vendor
    :type vendor: str

    :rtype: Union[MusicExportPreferencesResponse, Tuple[MusicExportPreferencesResponse, int], Tuple[MusicExportPreferencesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def post_music_export_job(authorization, x_authentication_provider, x_api_key, over16, body, vendor=None):  # noqa: E501
    """Music Export Jobs

    Create Export Job for a user  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param over16: Boolean age check
    :type over16: bool
    :param body: 
    :type body: list | bytes
    :param vendor: Specify Vendor Jobs
    :type vendor: str

    :rtype: Union[MusicExportSuccess, Tuple[MusicExportSuccess, int], Tuple[MusicExportSuccess, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = [MusicExportJob.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def post_music_preferences_export(authorization, x_authentication_provider, x_api_key, body):  # noqa: E501
    """Music Export Preferences

    Create export preferences (e.g. 3rd party vendors, partner id&#39;s) for a given BBC Music user.  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param body: 
    :type body: dict | bytes

    :rtype: Union[MusicExportSuccess, Tuple[MusicExportSuccess, int], Tuple[MusicExportSuccess, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = MusicExportPreferences.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_music_preferences_export_vendor(authorization, x_authentication_provider, x_api_key, vendor, body):  # noqa: E501
    """Music Export Vendor Preferences

    Create Vendor specific export preferences (e.g. 3rd party vendors, partner id&#39;s) for a given BBC Music user.  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param vendor: Supported 3rd Party Vendor
    :type vendor: str
    :param body: 
    :type body: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = MusicExportPreferences.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def put_music_preferences_export_vendor(authorization, x_authentication_provider, x_api_key, vendor, body):  # noqa: E501
    """Music Export Vendor Preferences

    Update vendor specific export preferences for a given BBC Music user.  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param vendor: Supported 3rd Party Vendor
    :type vendor: str
    :param body: 
    :type body: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = MusicExportPreferences.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
