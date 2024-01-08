import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.post_payments_cross_border_credit_transfers_consents_ok_body import PostPaymentsCrossBorderCreditTransfersConsentsOKBody  # noqa: E501
from openapi_server.models.post_payments_cross_border_credit_transfers_consents_params_body import PostPaymentsCrossBorderCreditTransfersConsentsParamsBody  # noqa: E501
from openapi_server import util


def payments_cross_border_credit_transfers_consents_post(body):  # noqa: E501
    """Request consent initiation via redirect

     # noqa: E501

    :param body: Cross border payment consent
    :type body: dict | bytes

    :rtype: Union[PostPaymentsCrossBorderCreditTransfersConsentsOKBody, Tuple[PostPaymentsCrossBorderCreditTransfersConsentsOKBody, int], Tuple[PostPaymentsCrossBorderCreditTransfersConsentsOKBody, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = PostPaymentsCrossBorderCreditTransfersConsentsParamsBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
