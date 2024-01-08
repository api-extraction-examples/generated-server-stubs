import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.personalised_radio_batch_request import PersonalisedRadioBatchRequest  # noqa: E501
from openapi_server.models.personalised_radio_error_response import PersonalisedRadioErrorResponse  # noqa: E501
from openapi_server.models.personalised_radio_request import PersonalisedRadioRequest  # noqa: E501
from openapi_server.models.personalised_radio_response import PersonalisedRadioResponse  # noqa: E501
from openapi_server.models.personalised_radio_success_response import PersonalisedRadioSuccessResponse  # noqa: E501
from openapi_server import util


def delete_personalised_radio_by_activity_type_by_id(authorization, x_authentication_provider, x_api_key, type, pid):  # noqa: E501
    """Favourite Episode or Clip

    Remove User favourite  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param type: Supported Radio favourite types: Clips or Episodes
    :type type: str
    :param pid: pid
    :type pid: str

    :rtype: Union[PersonalisedRadioSuccessResponse, Tuple[PersonalisedRadioSuccessResponse, int], Tuple[PersonalisedRadioSuccessResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_personalised_radio_follows_by_type_by_id(authorization, x_authentication_provider, x_api_key, type, pid):  # noqa: E501
    """Followed Brand or Series

    Remove &#39;brand&#39; or &#39;series&#39; items from a users iPlayer Radio follows  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param type: Supported Radio follows types: Brands or Series
    :type type: str
    :param pid: pid
    :type pid: str

    :rtype: Union[PersonalisedRadioSuccessResponse, Tuple[PersonalisedRadioSuccessResponse, int], Tuple[PersonalisedRadioSuccessResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_personalised_radio_by_activity_type_by_id(authorization, x_authentication_provider, x_api_key, type, pid, show_all_activity=None):  # noqa: E501
    """Favourite Episode or Clip

    Check to see if a single clip or episode entity is in a users favourites - determines UX of add button.  N.B.  Swagger schemas cannot currently handle multiple combinations of object in an array i.e. a mix of Episode and Clip Summaries so we are defining data as a Programme Summary here.  This will be resolved in V3 with full support for  anyOf https://www.openapis.org/blog/2017/01/24/a-new-year-a-new-specification  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param type: Supported Radio favourite types: Clips or Episodes
    :type type: str
    :param pid: pid
    :type pid: str
    :param show_all_activity: Include items which have been &#39;soft&#39; unfavourited in response. I.e items with UAS type of &#39;unfavourited&#39;
    :type show_all_activity: bool

    :rtype: Union[PersonalisedRadioResponse, Tuple[PersonalisedRadioResponse, int], Tuple[PersonalisedRadioResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_personalised_radio_favourites(authorization, x_authentication_provider, x_api_key, offset=None, limit=None, sort=None, show_all_activity=None):  # noqa: E501
    """Favourite Episodes and Clips

    List of favourited episodes and clips for a given user for iPlayer Radio.  N.B.  Swagger schemas cannot currently handle multiple combinations of object in an array i.e. a mix of Episode and Clip Summaries so we are defining data as a Programme Summary here.  This will be resolved in V3 with full support for  anyOf https://www.openapis.org/blog/2017/01/24/a-new-year-a-new-specification  # noqa: E501

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
    :param sort: Sort order for Personalised Radio results
    :type sort: str
    :param show_all_activity: Include items which have been &#39;soft&#39; unfavourited in response. I.e items with UAS type of &#39;unfavourited&#39;
    :type show_all_activity: bool

    :rtype: Union[PersonalisedRadioResponse, Tuple[PersonalisedRadioResponse, int], Tuple[PersonalisedRadioResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_personalised_radio_favourites_by_type(authorization, x_authentication_provider, x_api_key, type, sort=None, show_all_activity=None, offset=None, limit=None):  # noqa: E501
    """Favourite Episodes and Clips by Type

    List of followed &#39;clips&#39; or &#39;episode&#39; items for a given iPlayer Radio user  N.B.  Swagger schemas cannot currently handle multiple combinations of object in an array i.e. a mix of Episode and Clip Summaries so we are defining data as a Programme Summary here.  This will be resolved in V3 with full support for  anyOf https://www.openapis.org/blog/2017/01/24/a-new-year-a-new-specification  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param type: Supported Radio favourite types: Clips or Episodes
    :type type: str
    :param sort: Sort order for Personalised Radio results
    :type sort: str
    :param show_all_activity: Include items which have been &#39;soft&#39; unfavourited in response. I.e items with UAS type of &#39;unfavourited&#39;
    :type show_all_activity: bool
    :param offset: Paginated results offset
    :type offset: int
    :param limit: Paginated results limit
    :type limit: int

    :rtype: Union[PersonalisedRadioResponse, Tuple[PersonalisedRadioResponse, int], Tuple[PersonalisedRadioResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_personalised_radio_follows(authorization, x_authentication_provider, x_api_key, offset=None, limit=None, sort=None, show_all_activity=None):  # noqa: E501
    """Followed Brands and Series

    List of favourited brands and series for a given user for iPlayer Radio.  N.B.  Swagger schemas cannot currently handle multiple combinations of object in an array i.e. a mix of Episode and Clip Summaries so we are defining data as a Programme Summary here.  This will be resolved in V3 with full support for  anyOf https://www.openapis.org/blog/2017/01/24/a-new-year-a-new-specification  # noqa: E501

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
    :param sort: Sort order for Personalised Radio results
    :type sort: str
    :param show_all_activity: Include items which have been &#39;soft&#39; unfollowed in response. I.e items with UAS type of &#39;unfollowed&#39;
    :type show_all_activity: bool

    :rtype: Union[PersonalisedRadioResponse, Tuple[PersonalisedRadioResponse, int], Tuple[PersonalisedRadioResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_personalised_radio_follows_by_type(authorization, x_authentication_provider, x_api_key, type, sort=None, offset=None, limit=None, show_all_activity=None):  # noqa: E501
    """Followed Brands or Series by Type

    List of followed &#39;brand&#39; or &#39;series&#39; items for a given iPlayer Radio user  N.B.  Swagger schemas cannot currently handle multiple combinations of object in an array i.e. a mix of Episode and Clip Summaries so we are defining data as a Programme Summary here.  This will be resolved in V3 with full support for  anyOf https://www.openapis.org/blog/2017/01/24/a-new-year-a-new-specification  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param type: Supported Radio follows types: Brands or Series
    :type type: str
    :param sort: Sort order for Personalised Radio results
    :type sort: str
    :param offset: Paginated results offset
    :type offset: int
    :param limit: Paginated results limit
    :type limit: int
    :param show_all_activity: Include items which have been &#39;soft&#39; unfollowed in response. I.e items with UAS type of &#39;unfollowed&#39;
    :type show_all_activity: bool

    :rtype: Union[PersonalisedRadioResponse, Tuple[PersonalisedRadioResponse, int], Tuple[PersonalisedRadioResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_personalised_radio_follows_by_type_by_id(authorization, x_authentication_provider, x_api_key, type, pid):  # noqa: E501
    """Followed Brand or Series

    Check to see if a single brand or series entity is in a users follows - determines UX of add button.  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param type: Supported Radio follows types: Brands or Series
    :type type: str
    :param pid: pid
    :type pid: str

    :rtype: Union[PersonalisedRadioResponse, Tuple[PersonalisedRadioResponse, int], Tuple[PersonalisedRadioResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_personalised_radio_plays(authorization, x_authentication_provider, x_api_key, offset=None, limit=None, sort=None, show_all_activity=None):  # noqa: E501
    """Played Episode or Clip

    Returns mixed episode and clip plays for a given BBC iPlayer radio user.  N.B.  Swagger schemas cannot currently handle multiple combinations of object in an array i.e. a mix of Episode and Clip Summaries so we are defining data as a Programme Summary here.  This will be resolved in V3 with full support for  anyOf https://www.openapis.org/blog/2017/01/24/a-new-year-a-new-specification  # noqa: E501

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
    :param sort: Sort order for Personalised Radio results
    :type sort: str
    :param show_all_activity: Include expired/unavailable items
    :type show_all_activity: bool

    :rtype: Union[PersonalisedRadioResponse, Tuple[PersonalisedRadioResponse, int], Tuple[PersonalisedRadioResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def post_personalised_radio_batch(authorization, x_authentication_provider, x_api_key, body):  # noqa: E501
    """Favourite Episodes and Clips

    Add User favourites  N.B. Any HTML tags submitted in metadata will be removed  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param body: Action favourited or unfavourited
    :type body: list | bytes

    :rtype: Union[PersonalisedRadioSuccessResponse, Tuple[PersonalisedRadioSuccessResponse, int], Tuple[PersonalisedRadioSuccessResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = [PersonalisedRadioBatchRequest.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def post_personalised_radio_by_activity_type_by_id(authorization, x_authentication_provider, x_api_key, type, pid, body):  # noqa: E501
    """Favourite Episode or Clip

    Add User favourite  N.B. Any HTML tags submitted in metadata will be removed  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param type: Supported Radio favourite types: Clips or Episodes
    :type type: str
    :param pid: pid
    :type pid: str
    :param body: Action favourited or unfavourited
    :type body: dict | bytes

    :rtype: Union[PersonalisedRadioSuccessResponse, Tuple[PersonalisedRadioSuccessResponse, int], Tuple[PersonalisedRadioSuccessResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = PersonalisedRadioRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_personalised_radio_follows_batch(authorization, x_authentication_provider, x_api_key, body):  # noqa: E501
    """Followed Brands and Series

    Add &#39;brand&#39; or &#39;series&#39; items to a users iPlayer Radio follows  N.B. Any HTML tags submitted in metadata will be removed  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param body: Action followed or unfollowed
    :type body: list | bytes

    :rtype: Union[PersonalisedRadioSuccessResponse, Tuple[PersonalisedRadioSuccessResponse, int], Tuple[PersonalisedRadioSuccessResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = [PersonalisedRadioBatchRequest.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def post_personalised_radio_follows_by_type_by_id(authorization, x_authentication_provider, x_api_key, type, pid, body):  # noqa: E501
    """Followed Brand or Series

    Add &#39;brand&#39; or &#39;series&#39; items from a users iPlayer Radio follows  N.B. Any HTML tags submitted in metadata will be removed  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param type: Supported Radio follows types: Brands or Series
    :type type: str
    :param pid: pid
    :type pid: str
    :param body: Action followed or unfollowed
    :type body: dict | bytes

    :rtype: Union[PersonalisedRadioSuccessResponse, Tuple[PersonalisedRadioSuccessResponse, int], Tuple[PersonalisedRadioSuccessResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = PersonalisedRadioRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def put_personalised_radio_batch(authorization, x_authentication_provider, x_api_key, body):  # noqa: E501
    """Favourite Episodes and Clips

    Update user favourites  N.B. Any HTML tags submitted in metadata will be removed  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param body: Action favourited or unfavourited
    :type body: list | bytes

    :rtype: Union[PersonalisedRadioSuccessResponse, Tuple[PersonalisedRadioSuccessResponse, int], Tuple[PersonalisedRadioSuccessResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = [PersonalisedRadioBatchRequest.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def put_personalised_radio_by_activity_type_by_id(authorization, x_authentication_provider, x_api_key, type, pid, body):  # noqa: E501
    """Favourite Episode or Clip

    Update user favourite  N.B. Any HTML tags submitted in metadata will be removed  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param type: Supported Radio favourite types: Clips or Episodes
    :type type: str
    :param pid: pid
    :type pid: str
    :param body: Action favourited or unfavourited
    :type body: dict | bytes

    :rtype: Union[PersonalisedRadioSuccessResponse, Tuple[PersonalisedRadioSuccessResponse, int], Tuple[PersonalisedRadioSuccessResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = PersonalisedRadioRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def put_personalised_radio_follows_batch(authorization, x_authentication_provider, x_api_key, body):  # noqa: E501
    """Followed Brands and Series

    Update &#39;brands&#39; or &#39;series&#39; items from a users iPlayer Radio follows  N.B. Any HTML tags submitted in metadata will be removed  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param body: Action followed or unfollowed
    :type body: list | bytes

    :rtype: Union[PersonalisedRadioSuccessResponse, Tuple[PersonalisedRadioSuccessResponse, int], Tuple[PersonalisedRadioSuccessResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = [PersonalisedRadioBatchRequest.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def put_personalised_radio_follows_by_type_by_id(authorization, x_authentication_provider, x_api_key, type, pid, body):  # noqa: E501
    """Followed Brand or Series

    Update &#39;brand&#39; or &#39;series&#39; items from a users iPlayer Radio follows  N.B. Any HTML tags submitted in metadata will be removed  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param type: Supported Radio follows types: Brands or Series
    :type type: str
    :param pid: pid
    :type pid: str
    :param body: Action followed or unfollowed
    :type body: dict | bytes

    :rtype: Union[PersonalisedRadioSuccessResponse, Tuple[PersonalisedRadioSuccessResponse, int], Tuple[PersonalisedRadioSuccessResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = PersonalisedRadioRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
