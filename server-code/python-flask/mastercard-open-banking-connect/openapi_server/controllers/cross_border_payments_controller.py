import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.post_payments_cross_border_credit_transfers_ok_body import PostPaymentsCrossBorderCreditTransfersOKBody  # noqa: E501
from openapi_server.models.post_payments_cross_border_credit_transfers_params_body import PostPaymentsCrossBorderCreditTransfersParamsBody  # noqa: E501
from openapi_server import util


def payments_cross_border_credit_transfers_post(body):  # noqa: E501
    """Redeem the payment

     # noqa: E501

    :param body: Request Body
    :type body: dict | bytes

    :rtype: Union[PostPaymentsCrossBorderCreditTransfersOKBody, Tuple[PostPaymentsCrossBorderCreditTransfersOKBody, int], Tuple[PostPaymentsCrossBorderCreditTransfersOKBody, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = PostPaymentsCrossBorderCreditTransfersParamsBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
