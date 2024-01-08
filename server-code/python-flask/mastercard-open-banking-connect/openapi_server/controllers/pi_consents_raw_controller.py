import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.post_payments_consents_raw_ok_body import PostPaymentsConsentsRawOKBody  # noqa: E501
from openapi_server.models.post_payments_consents_raw_params_body import PostPaymentsConsentsRawParamsBody  # noqa: E501
from openapi_server import util


def payments_consents_raw_post(body):  # noqa: E501
    """Extracts the original raw consent given by the aspsp

    Extracts the original raw consent given by the aspsp # noqa: E501

    :param body: Request Body
    :type body: dict | bytes

    :rtype: Union[PostPaymentsConsentsRawOKBody, Tuple[PostPaymentsConsentsRawOKBody, int], Tuple[PostPaymentsConsentsRawOKBody, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = PostPaymentsConsentsRawParamsBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
