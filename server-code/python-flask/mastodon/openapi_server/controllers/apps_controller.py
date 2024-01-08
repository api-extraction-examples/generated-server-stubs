import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.api_v1_apps_post200_response import ApiV1AppsPost200Response  # noqa: E501
from openapi_server.models.api_v1_apps_post_request import ApiV1AppsPostRequest  # noqa: E501
from openapi_server.models.application import Application  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def api_v1_apps_post(api_v1_apps_post_request=None):  # noqa: E501
    """api_v1_apps_post

    Create a new application to obtain OAuth2 credentials. # noqa: E501

    :param api_v1_apps_post_request: 
    :type api_v1_apps_post_request: dict | bytes

    :rtype: Union[ApiV1AppsPost200Response, Tuple[ApiV1AppsPost200Response, int], Tuple[ApiV1AppsPost200Response, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        api_v1_apps_post_request = ApiV1AppsPostRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def api_v1_apps_verify_credentials_get():  # noqa: E501
    """api_v1_apps_verify_credentials_get

    Confirm that the app&#39;s OAuth2 credentials work. # noqa: E501


    :rtype: Union[Application, Tuple[Application, int], Tuple[Application, int, Dict[str, str]]
    """
    return 'do some magic!'
