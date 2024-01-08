import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.post_payments_domestic_credit_transfers_ok_body import PostPaymentsDomesticCreditTransfersOKBody  # noqa: E501
from openapi_server.models.post_payments_domestic_credit_transfers_params_body import PostPaymentsDomesticCreditTransfersParamsBody  # noqa: E501
from openapi_server import util


def payments_domestic_credit_transfers_post(body):  # noqa: E501
    """Redeem the payment

    Redeem the payment which was previously consented by the PSU. # noqa: E501

    :param body: Request Body
    :type body: dict | bytes

    :rtype: Union[PostPaymentsDomesticCreditTransfersOKBody, Tuple[PostPaymentsDomesticCreditTransfersOKBody, int], Tuple[PostPaymentsDomesticCreditTransfersOKBody, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = PostPaymentsDomesticCreditTransfersParamsBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
