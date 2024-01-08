import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.post_aspsps_ok_body import PostAspspsOKBody  # noqa: E501
from openapi_server.models.post_aspsps_params_body import PostAspspsParamsBody  # noqa: E501
from openapi_server import util


def payments_aspsps_post(body):  # noqa: E501
    """Get list of ASPSPs

    Get the list of all active ASPSPs supported by the Open Banking Connect platform at this time with possibility to filter by id, name or country. This list is updated regularly as new ASPSPs are connected. # noqa: E501

    :param body: Request Body
    :type body: dict | bytes

    :rtype: Union[PostAspspsOKBody, Tuple[PostAspspsOKBody, int], Tuple[PostAspspsOKBody, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = PostAspspsParamsBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
